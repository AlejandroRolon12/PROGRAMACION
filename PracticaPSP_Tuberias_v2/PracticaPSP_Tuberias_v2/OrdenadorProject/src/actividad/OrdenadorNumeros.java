package actividad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * OrdenadorNumeros - PROGRAMA INDIVIDUAL
 * Lee enteros por stdin y los imprime ordenados por stdout.
 */
public class OrdenadorNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) break;
                try {
                    lista.add(Integer.parseInt(linea));
                } catch (NumberFormatException e) {
                    System.err.println("Ignorada (no entero): " + linea);
                }
            }
        } catch (Exception e) {
            System.err.println("Error leyendo entrada: " + e.getMessage());
            System.exit(1);
        }
        Collections.sort(lista);
        for (int n : lista) System.out.println(n);
    }
}
