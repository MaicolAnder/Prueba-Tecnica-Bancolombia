package evalart;

/**
 * @author Miguel A Tunubalá
 * Concatenar nombres sin usar el operador +
 */
public class ConcatenadorNombres {

    public static void ConcatenadorNombres() {
        String nombre = "Miguel";
        String apellidos = "Tunubala";

        // Crear instancia de la clase y concatenar nombre y apellidos
        ConcatenadorNombres concatenador = new ConcatenadorNombres();
        String resultado = concatenador.concatenar(nombre, apellidos);
        System.out.println("Resultado: " + resultado);
    }

    public String concatenar(String nombre, String apellidos) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(nombre).append(" ").append(apellidos);
        return resultado.toString();
    }
}