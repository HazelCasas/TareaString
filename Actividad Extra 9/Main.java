package org.example;

import org.example.Controlador.ControladorLibro;
import org.example.Modelo.Libro;
import org.example.Persistencia.DemoLibroDB;
import org.example.Persistencia.LibroDAO;
import org.example.Vista.VentanaLibro;

import javax.swing.*;
import java.sql.SQLException;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)
    {
        VentanaLibro view = new VentanaLibro("MVC y JDBC");
        ControladorLibro controller = new ControladorLibro(view);
    }
}