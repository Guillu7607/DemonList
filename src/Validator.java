public class Validator {

    public static boolean esNombrePermitido(String nombre) {

        if (nombre.equalsIgnoreCase("Grief")) {
            System.out.println("Nivel todavía no verificado. No entra en la lista");
            return false;
        }

        if (nombre.equalsIgnoreCase("Stereo Madness")) {
            System.out.println("No es nivel de la dificultad pedida");
            return false;
        }

        if (nombre.equals("Thinking Space 2")) {
            System.out.println("https://youtu.be/CELNmHwln_c?si=FLONP4cNTJ4yaUU7");
        }

        if (nombre.equals("Bloodbath")) {
            System.out.println("https://youtu.be/twTw4fjT0ik?si=nLg-xwxkRF8cg6G2 A partir de 1:51");
        }

        if (nombre.equalsIgnoreCase("FutureFunk")) {
            System.out.println("No es Nivel de la dificultad pedida");
            return false;
        }
        if (nombre.equals("Slaughterhouse")) {
            System.out.println("https://youtu.be/kpcF1-QAHQc?si=U5LB1HaO5mWEBVOJ");
        }
        if (nombre.equals("Acheron")) {
            System.out.println("https://youtu.be/sBKR6aUorzA?si=8WaMdT3k8lbrbdVo");
        }
        if (nombre.equals("Kenos")) {
            System.out.println("https://youtu.be/Bs1kVySdUtI?si=YJqLs7h62rhLsVXq");
        }
        if (nombre.equalsIgnoreCase("Orbit")) {
            System.out.println("Nivel todavia no puesto en lista");
            return false;
        }

        return true;
    }
}
