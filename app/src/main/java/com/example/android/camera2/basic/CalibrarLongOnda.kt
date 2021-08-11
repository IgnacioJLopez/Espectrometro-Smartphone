package com.example.calibrarlongituddeonda

class CalibrarLongOnda() {

    /** Declaracion de variables a utilizar */
    var posicionesMaximos = ArrayList<Int>()
    var posicionesMinimos = ArrayList<Int>()
    var ordenCero = 0
    var primerMaximo = 0
    var indiceOrdenCero = 0
    var oz = ArrayList<Int>()

    fun maxMinFinder(intensidades: IntArray) {
        val ancho = 12 // Ancho con el que defino que un punto es un maximo o minimo
        for (i in ancho+1..intensidades.size - (ancho+1)) {
            /** Si cumple estas condiciones es un máximo */
            if (intensidades[i] >= intensidades.sliceArray(i-ancho..i-1).maxOrNull()!! &&
                intensidades[i] >= intensidades.sliceArray(i+1..i+ancho).maxOrNull()!! && intensidades[i] > 100)
                {
                posicionesMaximos.add(i) // Adjunta la posicion del maximo al vector de maximos

                /** Si cumple esta condicion es el orden cero */
                if(intensidades[i]>700){
                    indiceOrdenCero = posicionesMaximos.size-1
                    oz.add(i) //Adjunta todos los maximos del orden cero (si está saturado)
                }
            }

            /** Si cumple estas condiciones es un mínimo */
            if (intensidades[i] < intensidades.sliceArray(i-ancho..i-1).minOrNull()!! &&
                intensidades[i] < intensidades.sliceArray(i+1..i+ancho).minOrNull()!!)
            {
                println("min en $i de ${intensidades[i]}")
                posicionesMinimos.add(i)
            }
        }
        ordenCero = (oz.last()+oz.first()).div(2) // Si está saturado usa el punto medio entre los saturados
        primerMaximo = posicionesMaximos.last() //Maximo en 452 nm
    }
}