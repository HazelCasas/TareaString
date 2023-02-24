package TAREAS;

import java.util.Scanner;

public class TareaASCII
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = teclado.nextLine();
        System.out.println("Tecleaste: " + cadena);
        for (int i = 0; i < cadena.length(); i++)
        {
            if((int)cadena.charAt(i) != (int)cadena.charAt(i+1)-1)
            {
                System.out.println("False");
                return;
            }
            else
            {
                System.out.println("True");
                return;
            }
        }
    }
}
