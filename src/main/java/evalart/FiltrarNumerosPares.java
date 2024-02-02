package evalart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Miguel A Tunubalá
 * Filtro de numeros pares de una lista
 */
public class FiltrarNumerosPares {
    public static void FiltrarNumerosPares() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = filtrarNumerosPares(numeros);
        System.out.println("Números pares: " + numerosPares);
    }

    public static List<Integer> filtrarNumerosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
    }
}