package actividad;

import java.util.Random;

/**
 * GeneradorNumeros
 *
 * Genera una serie de números enteros aleatorios (uno por línea) y los escribe
 * por la salida estándar. Se ha diseñado para ser usado en tuberías (pipes).
 *
 * <p>Uso:
 * <pre>
 * java actividad.GeneradorNumeros [cantidad] [maximo]
 * </pre>
 * donde:
 * <ul>
 *   <li>cantidad - (opcional) número de valores a generar. Por defecto 10.</li>
 *   <li>maximo - (opcional) valor máximo (incluido) de los números generados. Por defecto 100.</li>
 * </ul>
 *
 * Ejemplo:
 * <pre>
 * java actividad.GeneradorNumeros 20 500
 * </pre>
 *
 * @author Alejandro Rolón
 */
public class GeneradorNumeros {
    public static void main(String[] args) {
        int cantidad = 10;
        int maximo = 100;
        try {
            if (args.length >= 1) cantidad = Integer.parseInt(args[0]);
            if (args.length >= 2) maximo = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Argumentos inválidos. Uso: java actividad.GeneradorNumeros [cantidad] [maximo]");
            System.exit(1);
        }

        if (cantidad <= 0 || maximo <= 0) {
            System.err.println("cantidad y maximo deben ser > 0");
            System.exit(1);
        }

        Random rnd = new Random();
        for (int i = 0; i < cantidad; i++) {
            int num = rnd.nextInt(maximo) + 1; // 1..maximo
            System.out.println(num);
        }
    }
}
