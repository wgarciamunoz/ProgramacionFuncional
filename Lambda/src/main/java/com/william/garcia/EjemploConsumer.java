package com.william.garcia;

import com.william.garcia.models.Usuario;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {

        // Consumer es una interfaz funcional que se utiliza para representar una función que toma un solo argumento y
        // no devuelve ningún resultado
        java.util.function.Consumer<String> consumidor = saludo -> System.out.println("saludo = " + saludo);

        // implemantacion del objeto Consumer
        /*
        el Consumer se puede utilizar en cualquier lugar donde se necesite realizar una acción en un objeto o conjunto
        de objetos, sin necesidad de devolver ningún resultado.
        */

        consumidor.accept("Hola");

        //Referencias de métodos en expresiones lambda de tipo Consumer
        java.util.function.Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola Mundo");

        Usuario usuario = new Usuario();
        /*
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
          persona.setNombre(nombre);
        };
        */

        // Referencia del método
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "Geovanny");

        System.out.println("usuario = " + usuario.getNombre());


        // Supplier en Java con una expresión lambda que no reciba argumentos y devuelva un valor

        Supplier<String> proveedor = () -> {
            return "Hola Supplier";
        };

        System.out.println(proveedor.get());
    }
}
