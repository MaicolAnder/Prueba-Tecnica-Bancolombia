package evalart;

public class HilosParesImpares {
    public static void HilosParesImpares() {
        Runnable imprimirPares = () -> imprimirNumeros(true);
        Runnable imprimirImpares = () -> imprimirNumeros(false);

        Thread hiloPares = new Thread(imprimirPares);
        Thread hiloImpares = new Thread(imprimirImpares);

        hiloPares.start();
        hiloImpares.start();
    }

    private static void imprimirNumeros(boolean esPar) {
        for (int i = esPar ? 2 : 1; i <= 10; i += 2) {
            if (esPar) {
                System.out.println("Hilo Pares: " + i);
            } else {
                System.out.println("Hilo Impares: " + i);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}