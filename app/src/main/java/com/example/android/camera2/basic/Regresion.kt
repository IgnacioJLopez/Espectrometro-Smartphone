package com.example.calibrarlongituddeonda

import org.apache.commons.math3.fitting.PolynomialCurveFitter
import org.apache.commons.math3.fitting.WeightedObservedPoints

class Regresion {
    fun getPolynomialFitter(x: MutableList<Double>, y: MutableList<Double>, n: Int): DoubleArray {
        val fitter = PolynomialCurveFitter.create(n) // n es el grado del polinomio a fitear
        val obs = WeightedObservedPoints() // Vector donde se agregan los datos a fitear
        for (i in 0 until x.size) {
            obs.add(x[i], y[i]) // Guarda (x,y) en el vector de datos a fitear
        }
        return fitter.fit(obs.toList()) // Devuelve los parametros del ajuste
    }
}