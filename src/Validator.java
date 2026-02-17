public class Validator {

    public static boolean esNombrePermitido(String nombre) {

        if (nombre.equalsIgnoreCase("Grief")) {
            System.out.println("Nivel todavía no verificado. No entra en la lista");
            return false;
        }

        if (nombre.equalsIgnoreCase("Stereo Madness")) {
            System.out.println("¿Te crees muy gracioso no?");
            return false;
        }

        if (nombre.equals("Thinking Space 2")) {
            System.out.println("Felicidades por pasarte el Top 1");
        }

        if (nombre.equals("Bloodbath")) {
            System.out.println("Recuerdo cuando este nivel era top 1. HACE 10 AÑOS");
        }

        if (nombre.equalsIgnoreCase("FutureFunk")) {
            System.out.println("Este NO es un Extreme Demon!");
            return false;
        }

        return true; // permitido
    }
}
