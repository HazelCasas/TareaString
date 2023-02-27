package TAREAS;

import java.util.Scanner;

public class TareaJuegoGato
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa solo 'X'','O' y '_': ");
        String simbolos = teclado.nextLine();

        if (simbolos.length() != 9)
        {
            System.out.println("Debes ingresar nueve caracteres.");
        }
        else
        {
            System.out.println("Ingresaste la cadena: "+simbolos);
            System.out.println("-----");
            for (int i = 0; i < simbolos.length();i+=3)
            {
                String tres=simbolos.substring(i,i+3);
                System.out.println("|" + tres + "|");
            }
            System.out.println("-----");
        }
    }
}
