package TAREAS;

import java.awt.*;

//ATRIBUTOS
public class Perro
{
    private String nombre;
    private int edad;
    private String raza;
    private String tamaño;
    private Color color;

    public Perro()
    {
    }

    //CONSTRUCTORES
    public Perro(String nombre, int edad, String raza, String tamaño, Color color)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamaño = tamaño;
        this.color = color;
    }

    public Perro(String nombre, String raza, String tamaño)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public Perro(int edad)
    {
        this.edad = edad;
    }

    public Perro(Color color)
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
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
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", tamaño='" + tamaño + '\'' +
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
    public boolean ladrido()
    {
        System.out.println("¿" + nombre + " ladrará?");
        boolean ronronear = Math.random() > 0.51;
        return ronronear;
    }
}
