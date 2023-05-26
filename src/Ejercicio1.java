import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        Double Numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        Double Numero2 = scanner.nextDouble();

        // Suma de los números
        Double Suma = Numero1 + Numero2;
        System.out.println("La suma de los dos números es: " + Suma);
        // Resta de los números
        Double Resta = Numero1 - Numero2;
        System.out.println("La resta de los dos números es: " + Resta);
        // División de los números
        Double Division = Numero1 / Numero2;
        System.out.print("La división de los dos números es: " + Division);
        // Multiplicaión de los números
        Double Multiplicacion = Numero1 * Numero2;
        System.out.println("La multiplicacion de los dos numeros es: " + Multiplicacion);

        scanner.close();
    }
}