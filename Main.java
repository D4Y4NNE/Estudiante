public class Main
{
    public static void main(String []args)
    {
        Estudiante estudiante = new Estudiante("Celestia", 20, true);
        Estudiante estudiante2 = new Estudiante("Sakura", 18, false);
        System.out.println(" NOMBRE 01: " + estudiante.mostrarNombre());
        System.out.println(" EDAD 01: " + estudiante.mostrarEdades());
        System.out.println(" NOMBRE 02: " + estudiante2.mostrarNombre());
        System.out.println(" EDAD 02: " + estudiante2.mostrarEdades());

        if (estudiante.confirmarAprobado())
        {
            System.out.println(" ESTUDIANTE 01 APROBO");
        }
        else
        {
            System.out.println(" ESTUDIANTE 02 REPROBO");
        }
    }
}
