package actividad;

import java.util.Random;

/**
 * GeneradorNumeros - PROGRAMA INDIVIDUAL
 * Genera números enteros aleatorios (uno por línea) por stdout.
 * Uso: java actividad.GeneradorNumeros [cantidad] [maximo]
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
        java.util.Random rnd = new java.util.Random();
        for (int i = 0; i < cantidad; i++) {
            System.out.println(rnd.nextInt(maximo) + 1);
        }
    }
}
