package TAREAS.Cafetera;

public class DriverCafetera
{
    public static void main(String[] args)
    {
        ClaseCafetera cafetera1 = new ClaseCafetera();
        for (int i = 0; i < 15; i++)
        {
            cafetera1.Americano();
        }
        for (int i = 0; i < 15; i++)
        {
            cafetera1.Expreso();
        }
        for (int i = 0; i < 10; i++)
        {
            cafetera1.Capuchino();
        }
        cafetera1.EstadoCafetera();
    }
}
