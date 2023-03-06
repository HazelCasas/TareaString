package TAREAS;

import java.awt.*;

public class ClasesDriver
{
    public static void main(String[] args)
    {
        Gato gato = new Gato("Adan",1,"Criollo", "Chico",Color.BLACK);
        System.out.println(gato);
        System.out.println(gato.hambre());
        System.out.println(gato.sed());
        System.out.println(gato.ronroneo());
        Gato gato1 = new Gato("White", 2, "Khao Manne", "Mediano",Color.WHITE);
        System.out.println(gato1);
        System.out.println(gato1.hambre());
        System.out.println(gato1.sed());
        System.out.println(gato1.ronroneo());

        System.out.println();

        Perro perro = new Perro("Rocko",1,"Bully", "Mediano",Color.gray);
        System.out.println(perro);
        System.out.println(perro.hambre());
        System.out.println(perro.sed());
        System.out.println(perro.ladrido());
        Perro perro1 = new Perro("Tery",2,"Pomerania", "Chico",Color.white);
        System.out.println(perro1);
        System.out.println(perro1.hambre());
        System.out.println(perro1.sed());
        System.out.println(perro1.ladrido());
    }

}