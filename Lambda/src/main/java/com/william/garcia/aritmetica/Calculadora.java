package com.william.garcia.aritmetica;

public class Calculadora {
    public double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a, b);
    }
}
