package com.example.android.camera2.basic.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.android.camera2.basic.R
import kotlinx.android.synthetic.main.imagen_espectro.*
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import java.io.File
import java.io.OutputStream
import java.util.*
import kotlin.math.*

class ImagenEspectroFragment: Fragment() {

    /** Declaracion de variables a utilizar */
    private val args: ImagenEspectroFragmentArgs by navArgs() // Recibe los datos del fragment anterior
    var datos = StringBuilder() // Vector vacio para guardar los datos en un .csv
    lateinit var graphview: GraphView
    var series = LineGraphSeries<DataPoint>() // Vector vacio para graficar los datos

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.imagen_espectro, container, false)

        graphview = view.findViewById(R.id.graph) as GraphView
        datos.append("Pixel, Longitud de onda (nm), R, G, B") // Primera linea del .csv
        /** Vectores que entrega el fragment anterior */
        var datosX = args.datosX
        var datosL = args.datosL
        var datosR = args.datosR
        var datosG = args.datosG
        var datosB = args.datosB

        /** Declaracion de más variables a utilizar */
        var alto = datosL.size
        var x: Double
        var l: Double
        var r: Double
        var g: Double
        var b: Double

        /** Loop para llenar los vectores que se utilizaran para graficar y guardar */
        for(i in 0 until alto){
            x = datosX[i].toDouble()
            l = datosL[i].toDouble()
            r = datosR[i].toDouble()
            g = datosG[i].toDouble()
            b = datosB[i].toDouble()
            series.appendData(DataPoint(l, (r+g+b).pow(2)*(1e-5)/(0.6)), true, alto-1) // Valores a graficar
            datos.append("\n$x,$l, $r, $g, $b") // Valores a guardar en el .csv
        }

        /** Configuracion de los parametros del gráfico */
        graphview.viewport.isXAxisBoundsManual = true
        graphview.viewport.setMinX(400.0)
        graphview.viewport.setMaxX(670.0)
        graphview.viewport.setMaxY(1.0)
        graphview.viewport.setMinY(0.0)
        graphview.viewport.isScrollable
        graphview.viewport.setScrollableY(true)
        graphview.gridLabelRenderer.horizontalAxisTitle = "Longitud de onda (nm)"
        graphview.gridLabelRenderer.verticalAxisTitle = "Intensidad (u.a.)"
        graphview.addSeries(series)

        return view
    }

    /** Función para guardar y compartir los datos */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_exportar.setOnClickListener {
            val datazo = (datos.toString()).toByteArray()
            Log.d("boton", "bytes = ${datazo.size}")
            val date = Date()
            val nombre = "${date.time}.csv"
            Log.d("boton", nombre)
            try {
                /** Guarda el archivo */
                val out: OutputStream? = context?.openFileOutput(nombre, Context.MODE_PRIVATE)
                out?.write(datazo)
                out?.close()
                /** Exporta el archivo */
                val context: Context = requireContext().applicationContext
                val filelocation: File = File(context.filesDir, nombre)
                val path: Uri = FileProvider.getUriForFile(
                    context,
                    "com.example.android.camera2.basic.fileprovider",
                    filelocation
                )
                val fileIntent: Intent = Intent(Intent.ACTION_SEND)
                fileIntent.setType("text/csv")
                fileIntent.putExtra(Intent.EXTRA_SUBJECT, "Datos")
                fileIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                fileIntent.putExtra(Intent.EXTRA_STREAM, path)
                startActivity(Intent.createChooser(fileIntent, "send mail"))
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }

}