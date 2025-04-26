import java.util.Scanner;

public class VerificarPalindromo {
    public static boolean esPalindromo(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true; // Caso base: todos los caracteres han sido comparados
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false; // No es palíndromo si las letras no coinciden
        }
        return esPalindromo(palabra, inicio + 1, fin - 1); // Recursividad
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        boolean resultado = esPalindromo(palabra, 0, palabra.length() - 1);
        System.out.println("La palabra \"" + palabra + "\" es un palíndromo: " + resultado);
    }
}
