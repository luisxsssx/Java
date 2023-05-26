import java.util.Scanner;

public class juegonum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generación de un número para saber si es mayor, menor o igual al número generado
        
        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();

        int numeroRandom = (int)(Math.random()*10+1);
        System.out.println("Numero Generado: " + numeroRandom);

        if(numero > numeroRandom)
            System.out.println("El número que ingresaste es mayor que el número generado");
        else if(numero < numeroRandom)
            System.out.println("El número que ingresaste en menor que el número generado");
        else if(numero == numeroRandom)
            System.out.println("El número que ingresaste es igual al número generado");

        scanner.close();
    }
}