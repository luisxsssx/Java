package Estructuras;

import java.util.Scanner;

public class sentenciaIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el angulo");
        int angulo = sc.nextInt();

        if (angulo == 90) {
            System.out.println("El angulo es recto");
        } else {
            System.out.println("El angulo no es correcto");
        }

        temperatura(); // Llamada al método temperatura

        sc.close();
    }

    public static void temperatura() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura");
        int temperatura = sc.nextInt();

        if (temperatura >= 100) {
            System.out.println("Por encima del punto de ebullicion");
        } else {
            System.out.println("Esta por debajo del punto de ebullicion");
        }

        sc.close();
    }
}