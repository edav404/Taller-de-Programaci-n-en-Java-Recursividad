import java.util.Scanner;

public class ContarCaracteres {

    public static int contarCaracter(String texto, char caracter) {
        // Caso base: cadena vacía
        if (texto.length() == 0) {
            return 0;
        }
        // Cuenta si el primer carácter es el buscado
        int cuenta = (texto.charAt(0) == caracter) ? 1 : 0;
        // Llamada recursiva con el resto de la cadena
        return cuenta + contarCaracter(texto.substring(1), caracter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese el carácter a contar: ");
        char caracter = scanner.next().charAt(0);
        System.out.println("El carácter '" + caracter + "' aparece " + contarCaracter(texto, caracter) + " veces en '" + texto + "'.");
    }
}
