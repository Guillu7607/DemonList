import java.util.*;
import java.io.*;

public class DemonList {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> demons = new HashMap<>();

        System.out.println("¿Cuántos niveles quieres introducir?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nombre del demon:");
            String nombre = sc.nextLine();

            if (!Validator.esNombrePermitido(nombre)) {
                continue;
            }

            System.out.println("Posición del nivel:");
            int posicion = sc.nextInt();
            sc.nextLine();

            demons.put(nombre, posicion);
        }

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(demons.entrySet());

        lista.sort(Map.Entry.comparingByValue());

        FileWriter writer = new FileWriter("resultado.txt");

        for (Map.Entry<String, Integer> entry : lista) {
            writer.write(entry.getKey() + " - Posición: " + entry.getValue() + "\n");
        }

        writer.close();

        System.out.println("Datos guardados en resultado.txt");
    }
}