package com.example.android.camera2.basic

import android.graphics.Bitmap
import android.graphics.Color
import com.example.calibrarlongituddeonda.Regresion


class Autorotar (myBitmap: Bitmap){

    private var alto = myBitmap.height
    private val ancho = myBitmap.width

    fun pendiente(myBitmap: Bitmap): DoubleArray{
        /** Declaracion de variables a utilizar */
        val intensidad = IntArray(ancho)
        val maximosI = arrayListOf<Double>()
        val maximosX = arrayListOf<Double>()
        val maximosY = arrayListOf<Double>()

        /** Barre el Bitmap para encontrar el maximo de cada y*/
        for(y in 250 until (alto-1)/10) { // Desde 2500 hasta alto con pasos de 10
            var iteradorI = 0
            var iteradorX = 0
            for (x in 0 until ancho-1) { // Barre x
                val argb = myBitmap.getPixel(x, 10*y) // Informacion del pixel (x, 10*y)
                intensidad[x] = (Color.red(argb) + Color.blue(argb) + Color.green(argb)) // R+G+B
                if (intensidad[x] > iteradorI && intensidad[x] > 25) { // Halla el maximo partiendo del umbral = 25
                    iteradorI = intensidad[x]
                    iteradorX = x
                }
            }
            /** Guarda los maximos en X con su valor de Y e Intensidad */
            if (iteradorI > 0) {
                maximosX.add(iteradorX.toDouble())
                maximosY.add(10*y.toDouble())
                maximosI.add(iteradorI.toDouble())

            }

        }
        /** Printea en terminal, util para analizarlo en Python */
        println("Y=np.array($maximosY)")
        println("X=np.array($maximosX)")
        println("I=np.array($maximosI)")

        if (maximosI.size > 0) { // If encontró algún máximo
            val regresion = Regresion() // Llama a la clase Regresion
            val m = regresion.getPolynomialFitter(maximosY, maximosX,1) // Pendiente y ordenanda al origen del ajuste lineal
            println("m = ${m[1]}") // Pendiente
            println("b = ${m[0]}") // Ordenada al origen

            val list: MutableList<Double> = m.toMutableList()
            list.add(maximosY.first()) // Primer maximo
            list.add(maximosY.last()) // Ultimo maximo

            return list.toDoubleArray()

        } else {
            println("No se encontró ningún maximo")
            return DoubleArray(3)
        }
    }

    var m  = pendiente(myBitmap) // Vector que devuelve la funcion pendiente

    var tita = 180*kotlin.math.atan(m[1])/3.1416 // Calcula el angulo a partir de la pendiente

}
