import java.util.Scanner;
public class InvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba una palabra: ");
        String palabra = sc.nextLine();

        // Usando StringBuilder para invertir
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        System.out.println("La palabra invertida es: " + palabraInvertida);
    }
}
