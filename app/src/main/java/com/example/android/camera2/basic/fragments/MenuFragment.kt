package com.example.android.camera2.basic.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.android.camera2.basic.R
import kotlin.math.abs

class MenuFragment: Fragment(){

    /** AndroidX navigation arguments */
    private val args: MenuFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.menu_inicial, container, false)
        val espectro = view.findViewById(R.id.MedirEspectro) as Button
        val absorbancia = view.findViewById<Button>(R.id.MedirAbsorbancia)
        val calibrar = view.findViewById<Button>(R.id.Calibrar)
        espectro.setOnClickListener {
            println("Proximamente") // Printeo en terminal
            /**
             *  Medir un espectro directamente con la calibracion ya guardada
             */
        }
        absorbancia.setOnClickListener {
            println("Proximamente")
            /**
             *  Medir absorbancia directamente con la calibracion ya guardada
             *
             */
        }
        calibrar.setOnClickListener {
            /** Te manda al fragment de calibracion: AutoRotateFragment */
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(
                    MenuFragmentDirections.actionMenuFragmentToAutoRotateFragment(
                        args.cameraId,
                        args.pixelFormat
                    )
                )
        }
        return view
    }
}