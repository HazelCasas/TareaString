package TAREAS;

import java.awt.*;

//ATRIBUTOS
public class Gato
{
    private String nombre;
    private int edad;
    private String raza;
    private String tamanio;
    private Color color;

    public Gato()
    {
    }

    //CONSTRUCTORES
    public Gato(String nombre, int edad, String raza, String tamanio,Color color)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio=tamanio;
        this.color = color;
    }
    public Gato(String nombre, String raza, String tamanio)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
    }
    public Gato(int edad)
    {
        this.edad = edad;
    }
    public Gato (Color color)
    {
        this.color = color;
    }

    //DE ACCESO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //TO STRING
    @Override
    public String toString()
    {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", tamanio=" + tamanio +
                ", color=" + color +
                '}';
    }

    //DE USO GENERAL
    public boolean hambre()
    {
        System.out.println("¿"+ nombre + " tiene hambre?");
        boolean hambre = Math.random() > 0.51;
        return hambre;
    }
    public boolean sed()
    {
        System.out.println("¿" + nombre + " tiene sed?");
        boolean sed = Math.random() > 0.51;
        return sed;
    }
    public boolean ronroneo()
    {
        System.out.println("¿" + nombre + " ronroneará?");
        boolean ronronear = Math.random() > 0.51;
        return ronronear;
    }
}

