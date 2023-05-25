package TAREAS.EjemploJOption;

import TAREAS.EjemploJOption.Controlador.ControladorEjemplo;
import TAREAS.EjemploJOption.Vista.Ventana;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Ventana ventana = new Ventana("Ejemplo JOption Pane");
        ControladorEjemplo controller = new ControladorEjemplo(ventana);
    }
}
