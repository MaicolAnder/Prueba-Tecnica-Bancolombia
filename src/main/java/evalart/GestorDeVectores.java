package evalart;

import java.util.Vector;

/**
 * @author Miguel A Tunubalá
 * Gestor de vectores
 */
public class GestorDeVectores {
    public static void GestorDeVectores() {
        Vector<Integer> vector = new Vector<>();

        agregarElemento(vector, 5);
        agregarElemento(vector, 10);
        eliminarElemento(vector, 0);

        int indice = buscarElemento(vector, 10);
        System.out.println("Indice buscado " +indice);
    }

    public static void agregarElemento(Vector<Integer> vector, int elemento) {
        vector.add(elemento);
    }

    public static void eliminarElemento(Vector<Integer> vector, int indice) {
        if (indice >= 0 && indice < vector.size()) {
            vector.remove(indice);
        }
    }

    public static int buscarElemento(Vector<Integer> vector, int elemento) {

        return vector.indexOf(elemento);
    }
}