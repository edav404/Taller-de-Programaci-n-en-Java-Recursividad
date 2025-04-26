import java.util.Scanner;

public class SumaDigitos {

    public static int sumaDigitos(int numero) {
        // Caso base: si el número tiene un solo dígito
        if (numero < 10) {
            return numero;
        }
        // Suma el último dígito más la suma de los demás
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        System.out.println("Suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
    }
}
