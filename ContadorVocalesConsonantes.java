import java.util.Scanner;

public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        String palabra;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra sin tildes: ");
        palabra = sc.next().toLowerCase();

        int vocales = 0;
        int consonantes = 0;
        for (char c : palabra.toCharArray()) {
            if (Character.isLetter(c)) { // Solo contar letras
                if ("aeiou".indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }
}