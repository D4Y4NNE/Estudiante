public class Estudiante
{
    private String nombre;
    private int edades;
    private boolean aprobado;
    public Estudiante(String nom, int edad, boolean aprob)
    {
        pedirNombre(nom);
        pedirEdades(edad);
        mostrarAprobado(aprob);
    }
    public void  pedirNombre(String nom)
    {
        nombre = nom;
    }
    public void pedirEdades(int edad)
    {
        if (edad>10 & edad<=21)
        {
            edades = edad;
        }
        else
        {
            edades = 0;
        }
    }
    public void  mostrarAprobado(boolean aprob)
    {
        if (aprob==true)
        {
            aprobado = true;
        }
        else
        {
            aprobado = false;
        }
    }
    public String mostrarNombre()
    {
        return  nombre;
    }
    public int mostrarEdades()
    {
        return edades;
    }
    public boolean confirmarAprobado()
    {
        return aprobado;
    }
}