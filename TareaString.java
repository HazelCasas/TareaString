package TAREAS;

import java.util.Scanner;

public class TareaString
{
    public static void main(String[] args)
    {
        Scanner datos = new Scanner(System.in);
        System.out.print("Escribe tu nombre, profesion y pais de origen: ");
        String entrada=datos.nextLine();

        String[] separado = entrada.split(" ");
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 1;j++)
            {
                System.out.print("Nombre: ");
                System.out.println(separado[0].toUpperCase());
                System.out.print("Profesion: ");
                System.out.println(separado[1].toUpperCase());
                System.out.print("Pais de origen: ");
                System.out.println(separado[2].toUpperCase());
            }

        }
    }
}
