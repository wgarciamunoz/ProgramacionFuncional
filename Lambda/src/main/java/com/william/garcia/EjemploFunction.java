package com.william.garcia;

import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        /* Es una combinacion entre el cosumidor que recibe argurmento,
         y Supplier que devuelve un resultado */
        Function<String,String> funcion = param -> "Hola que tal " + param;
        String resultado = funcion.apply("Geovanny");
        System.out.println("resultado = " + resultado);

        /*
        Expresión Lambda que elimine espacios, comas y puntos de una frase y
        además la devuelva la frase convertida en mayúscula.
         */
        Function<String,String> eliminaEspacios = param -> param.replace(" ", "").replace(",", "")
                .replace(".", "").toUpperCase();


    }
}
