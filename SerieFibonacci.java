import java.util.Scanner;

public class SerieFibonacci {

    public static int fibonacci(int n) {
        // Casos base
        if (n == 0) return 0;
        if (n == 1) return 1;
        // Suma de los dos anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición de Fibonacci que desea calcular: ");
        int posicion = scanner.nextInt();
        System.out.println("El número de la posición" + posicion + " de Fibonacci es: " + fibonacci(posicion));
    }
}
