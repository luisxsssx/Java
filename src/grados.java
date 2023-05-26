import java.util.Scanner;

public class grados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion de Celsius a Fahrenheit 

        System.out.println("Convertir temperatura de grados Celsuis a Fahrenheit");

        System.out.println("Ingresa la temperatura en grados Celsius: ");
        double temperatura = scanner.nextInt();

        double Fahrenheit = temperatura * 1.8 + 32;

        System.out.println("La conversion de la temperatura en grados Celsius a Fahrenheit es: " + Fahrenheit);


        // Conversion de Fahrenheit a Celsius

        System.out.println("Convertir temperatira de gradps Fahrenheit a Celsius");

        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        double Fahrenheit1 = scanner.nextInt();

        double temperaturaC = (Fahrenheit1 - 32) / 1.8;

        System.out.println("La temperatura en grados Celsius es: " + temperaturaC);

    
        scanner.close();
    }
}