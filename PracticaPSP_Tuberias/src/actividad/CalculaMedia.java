package actividad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CalculaMedia
 *
 * Lee números (uno por línea) desde la entrada estándar y calcula su media aritmética.
 * Imprime el resultado en formato:
 * Media: <valor_con_2_decimales>
 *
 * Si no se reciben números, imprime un mensaje explicativo.
 *
 * @author Alejandro Rolón
 */
public class CalculaMedia {
    public static void main(String[] args) {
        long suma = 0;
        long contador = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) break;
                try {
                    long v = Long.parseLong(linea);
                    suma += v;
                    contador++;
                } catch (NumberFormatException e) {
                    System.err.println("Ignorada (no entero): " + linea);
                }
            }
        } catch (Exception e) {
            System.err.println("Error leyendo entrada: " + e.getMessage());
            System.exit(1);
        }

        if (contador == 0) {
            System.out.println("No se recibieron números.");
        } else {
            double media = (double) suma / (double) contador;
            System.out.printf("Media: %.2f%n", media);
        }
    }
}
