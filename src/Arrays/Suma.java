package Arrays;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Ingrese los valores del array: ");

        for (int i = 0; i < size; i++){
            System.out.println("Elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < size; i++){
            suma += array[i];
        }

        double media = (double) suma/ size;

        System.out.println("Suma de los elementos " + suma);
        System.out.println("Media de los valores ingresador " + media);

        sc.close();
    }
}