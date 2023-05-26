import java.util.Scanner;

public class TablasMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        int multiplicando;
        int multiplicador;

        for(multiplicando = numero; multiplicando<=10; multiplicando++){
            for(multiplicador = numero; multiplicador<=10; multiplicador++) {
                int resultado = multiplicando * multiplicador;
                System.out.println(multiplicando + " X " + multiplicador + " = " + resultado);
            }
        }
        scanner.close();
    }
    
}
