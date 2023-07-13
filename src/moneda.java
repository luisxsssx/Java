import java.util.Scanner;

public class moneda {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Convertir peso mexicano a dolar

        System.out.println("Convertir pesos mexicanos a dolar");
        System.out.println("Ingresa la cantidad de pesos: ");
        double pesos = scanner.nextDouble();

        double dolares = (pesos / 17.67);

        System.out.print(pesos + " son equivalentes a " + dolares);

        scanner.close();
    }
}