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
            System.out.println("Bro NO es Zoink");
        }

        if (nombre.equals("Bloodbath")) {
            System.out.println("Recuerdo cuando este nivel era top 1. HACE 10 AÑOS");
        }

        if (nombre.equalsIgnoreCase("FutureFunk")) {
            System.out.println("Este NO es un Extreme Demon!");
            return false;
        }
        if (nombre.equals("Slaughterhouse")) {
            System.out.println("Ok ahora haz: https://youtu.be/Yu_p9yrVL0w?si=AoGC1BzZQ6sipu40");
        }

        return true; // permitido
    }
}
