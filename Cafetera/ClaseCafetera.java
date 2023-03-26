package TAREAS.Cafetera;

import java.util.Scanner;

public class ClaseCafetera
{
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public ClaseCafetera()
    {
        agua = 5000; //mililitros
        cafe = 1000; //gramos
        crema = 1500; //mililitros
        vasos = 50; //vasos
    }

    public ClaseCafetera(int agua, int cafe, int crema, int vasos)
    {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua()
    {
        return agua;
    }

    public void setAgua(int agua)
    {
        this.agua = agua;
    }

    public int getCafe()
    {
        return cafe;
    }

    public void setCafe(int cafe)
    {
        this.cafe = cafe;
    }

    public int getCrema()
    {
        return crema;
    }

    public void setCrema(int crema)
    {
        this.crema = crema;
    }

    public int getVasos()
    {
        return vasos;
    }

    public void setVasos(int vasos)
    {
        this.vasos = vasos;
    }

    @Override
    public String toString()
    {
        return "ClaseCafetera{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    public void Americano()
    {
        if(agua >= 180 && cafe >= 15 && vasos >= 1)
        {
            System.out.println("Aquí tienes tu cafe americano.");
            agua = agua - 180;
            cafe = cafe - 15;
            vasos = vasos - 1;
            System.out.println("Hay " + agua + " mililitros de agua.");
            System.out.println("Hay " + cafe + " gramos de cafe.");
            System.out.println("Hay " + crema + " militritos de crema.");
            System.out.println("Hay " + vasos + " vasos.");
            System.out.println("");
        }
        else
        {
            System.out.println("No se puede servir mas cafe.");
            System.out.println("Hay " + agua + " mililitros de agua.");
            System.out.println("Hay " + cafe + " gramos de cafe.");
            System.out.println("Hay " + crema + " mililitros de crema.");
            System.out.println("Hay " + vasos + " vasos.");
            System.out.println("");
        }
    }
    public void Expreso()
    {
        if(agua >= 120 && cafe >= 20 && vasos >= 1)
        {
            System.out.println("Aquí tienes tu cafe expreso.");
            agua = agua - 120;
            cafe = cafe - 20;
            vasos =vasos - 1;
            System.out.println("Hay " + agua + " mililitros de agua.");
            System.out.println("Hay " + cafe + " gramos de cafe.");
            System.out.println("Hay " + crema + " mililitros de crema.");
            System.out.println("Hay " + vasos + " vasos.");
            System.out.println("");
        }
        else
        {
            System.out.println("No se puede servir mas cafe.");
            System.out.println("Hay " + agua + " mililitros de agua.");
            System.out.println("Hay " + cafe + " gramos de cafe.");
            System.out.println("Hay " + crema + " mililitros de crema.");
            System.out.println("Hay " + vasos + " vasos.");
            System.out.println("");
        }
    }
    public void Capuchino()
    {
        if(agua >= 100 && crema >= 70 && cafe >= 14 && vasos >= 1)
        {
            System.out.println("Aquí tienes tu cafe capuchino.");
            agua = agua - 100;
            crema = crema - 70;
            cafe = cafe - 14;
            vasos = vasos - 1;
            System.out.println("Hay " + agua + " mililitros de agua.");
            System.out.println("Hay " + cafe + " gramos de cafe.");
            System.out.println("Hay " + crema + " mililitros de crema.");
            System.out.println("Hay " + vasos + " vasos.");
            System.out.println("");
        }
        else
        {
            System.out.println("No se puede servir mas cafe.");
            System.out.println("Hay " + agua + " mililitros de agua.");
            System.out.println("Hay " + cafe + " gramos de cafe.");
            System.out.println("Hay " + crema + " mililitros de crema.");
            System.out.println("Hay " + vasos + "vasos.");
            System.out.println("");
        }
    }

    public void EstadoCafetera()
    {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("---ESTADO DE LA CAFETERA---");
        System.out.println("Hay " + agua + " mililitros de agua.");
        System.out.println("Hay " + cafe + " gramos de cafe.");
        System.out.println("Hay " + crema + " mililitros de crema.");
        System.out.println("Hay " + vasos + " vasos.");
        System.out.println("---------------------------");
    }
}
