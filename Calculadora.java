
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double n1;
        double n2;
        double resultado;
        String opc;
        Scanner sc = new Scanner(System.in);

        Map<String, String> correcciones = new HashMap<>();
        correcciones.put("multiplicacion", "multiplicación");
        correcciones.put("division", "división");

        System.out.println("-----------------Calculadora Básica-----------------");
        System.out.println("Ingrese el primer número:");
        n1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        n2 = sc.nextDouble();
        System.out.println("Escriba la opción de la operación que quiere realizar:");
        System.out.print("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n");
        opc = sc.next().toLowerCase();

        if (correcciones.containsKey(opc)) {
            opc = correcciones.get(opc);
        }

        switch (opc) {
            case "1":
            case "suma":
                resultado = n1 + n2;
                System.out.printf("El resultado de la suma es: %.2f", resultado);
                break;
            case "2":
            case "resta":
                resultado = n1 - n2;
                System.out.printf("El resultado de la resta es: %.2f", resultado);
                break;
            case "3":
            case "multiplicación":
                resultado = n1 * n2;
                System.out.printf("El resultado de la mulitplicación es: %.2f", resultado);
                break;
            case "4":
            case "división":
                resultado = n1 / n2;
                System.out.printf("El resultado de la división es: %.2f", resultado);
                break;
            default:
                break;
        }
    }
}
