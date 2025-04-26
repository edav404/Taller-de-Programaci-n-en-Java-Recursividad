public class ImprimirDescendente {

    public static void imprimirDescendente(int n) {
        if (n == 0) {
            return; // Caso base: termina cuando llega a 0
        }
        System.out.println(n); // Imprime el  actual
        imprimirDescendente(n - 1); // Llamada recursiva con n-1
    }

    public static void main(String[] args) {
        System.out.println("Imprimiendo del 100 al 1:");
        imprimirDescendente(100); // Llamada inicial con 100
    }
}
