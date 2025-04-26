import java.util.Scanner;

public class RevertirCadena {

    public static String revertirCadena(String texto) {
        // Caso base: cadena vacía o de un solo carácter
        if (texto.length() <= 1) {
            return texto;
        }
        // Última letra + recursión con el resto
        return texto.charAt(texto.length() - 1) + revertirCadena(texto.substring(0, texto.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String palabra = scanner.nextLine();
        System.out.println("La cadena invertida de '" + palabra + "' es: " + revertirCadena(palabra));
    }
}
