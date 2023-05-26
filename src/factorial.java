import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int NumeroFactorial = scanner.nextInt();

        int factorial = 1;

        for(int i = 1; i <= NumeroFactorial; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + NumeroFactorial + " es: " + factorial);

        scanner.close();
    }
}                                       