package com.william.garcia.aritmetica;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        Aritmetica suma = (a,b) -> a + b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));

    }

}
