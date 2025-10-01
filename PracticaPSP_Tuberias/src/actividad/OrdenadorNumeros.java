package actividad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * OrdenadorNumeros
 *
 * Lee números enteros desde la entrada estándar (uno por línea) hasta EOF o línea vacía,
 * los ordena en orden ascendente y los imprime por salida estándar (uno por línea).
 *
 * Diseño para encadenar con GeneradorNumeros usando tuberías:
 * java actividad.GeneradorNumeros | java actividad.OrdenadorNumeros | ...
 *
 * @author Alejandro Rolón
 */
public class OrdenadorNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) break; // permite final con línea vacía
                try {
                    lista.add(Integer.parseInt(linea));
                } catch (NumberFormatException e) {
                    // Si se recibe una línea no numérica, se ignora y se escribe en err para traza.
                    System.err.println("Ignorada (no entero): " + linea);
                }
            }
        } catch (Exception e) {
            System.err.println("Error leyendo entrada: " + e.getMessage());
            System.exit(1);
        }

        Collections.sort(lista);
        for (int n : lista) {
            System.out.println(n);
        }
    }
}
