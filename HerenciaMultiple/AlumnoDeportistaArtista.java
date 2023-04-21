package TAREAS.HerenciaMultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista
{
    private int idActividadesExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numCuenta, String carrera, double promedio, int idActividadesExtra, String deporte, String arte) {
        super(nombre, edad, numCuenta, carrera, promedio);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividadesExtra() {
        return idActividadesExtra;
    }

    public void setIdActividadesExtra(int idActividadesExtra) {
        this.idActividadesExtra = idActividadesExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "idActividadesExtra=" + idActividadesExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }


    @Override
    public int ensayar(String disciplina)
    {
        System.out.println("El alumno esta ensayando " + this.arte);
        return 0;
    }

    @Override
    public boolean presentarObra()
    {
        System.out.println(getNombre() + "esta presentando una obra...");
        return true;
    }

    @Override
    public int entrenar()
    {
        System.out.println(getNombre() + " esta entrenando el deporte " + deporte);
        return 0;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion)
    {
        System.out.println(getNombre() + " esta en competencia del deporte " + deporte);
        return true;
    }
}

