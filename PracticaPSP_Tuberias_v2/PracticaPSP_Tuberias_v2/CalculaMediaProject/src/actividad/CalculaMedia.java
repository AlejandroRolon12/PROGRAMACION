package actividad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CalculaMedia - PROGRAMA INDIVIDUAL
 * Calcula la media de enteros recibidos por stdin.
 */
public class CalculaMedia {
    public static void main(String[] args) {
        long suma = 0;
        long cnt = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) break;
                try {
                    long v = Long.parseLong(linea);
                    suma += v;
                    cnt++;
                } catch (NumberFormatException e) {
                    System.err.println("Ignorada (no entero): " + linea);
                }
            }
        } catch (Exception e) {
            System.err.println("Error leyendo entrada: " + e.getMessage());
            System.exit(1);
        }
        if (cnt == 0) System.out.println("No se recibieron números.");
        else System.out.printf("Media: %.2f%n", (double)suma / cnt);
    }
}
