package org.example;

import org.example.Modelo.Libro;
import org.example.Persistencia.DemoLibroDB;
import org.example.Persistencia.LibroDAO;

import javax.swing.*;
import java.sql.SQLException;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)
    {
        LibroDAO ldao = new LibroDAO();
        try
        {
            Libro res = (Libro) ldao.buscarPorId("1");
            out.println(res);
            out.println("----------------");
            for (Object lib: ldao.obtenerTodo())
            {
                out.println((Libro)lib);
            }
        }
        catch (SQLException sqle)
        {
            out.println("Error");
            out.println(sqle.getMessage());
        }
    }
}