package Arrays.Unidimensionales;

import java.util.Scanner;

public class Elementos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos números quiere ingresar?");
        int cantidadNum = sc.nextInt();

        int[] numeros = new int[cantidadNum];

        System.out.println("Ingrese los " + cantidadNum + " números: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}