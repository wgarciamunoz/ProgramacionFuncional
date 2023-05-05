package com.william.garcia;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Consumer es una interfaz funcional que se utiliza para representar una función que toma un solo argumento y
        // no devuelve ningún resultado
        Consumer <String> consumidor = saludo -> System.out.println("saludo = " + saludo);

        // implemantacion del objeto Consumer
        /*
        el Consumer se puede utilizar en cualquier lugar donde se necesite realizar una acción en un objeto o conjunto
        de objetos, sin necesidad de devolver ningún resultado.
        */

        consumidor.accept("Hola");
    }
}