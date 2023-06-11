package Estructuras;

import java.util.Scanner;

public class nominaSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el total de horas trabajadas:");
        double numeroHoras = sc.nextDouble();

        System.out.println("Ingrese la tarifa:");
        double tarifaHoras = sc.nextDouble();

        double impuesto;
        double sueldoBruto;

        if (numeroHoras <= 35) {
            sueldoBruto = numeroHoras * tarifaHoras;
        } else {
            sueldoBruto = 35 * tarifaHoras + (numeroHoras - 35) * 1.5 * tarifaHoras;
        }

        if (sueldoBruto <= 2000) {
            impuesto = sueldoBruto * 0.1; // Ejemplo de cálculo de impuesto (10%)
        } else {
            impuesto = sueldoBruto * 0.2; // Ejemplo de cálculo de impuesto (20%)
        }

        double sueldoNeto = sueldoBruto - impuesto;

        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Sueldo neto: " + sueldoNeto);

        sc.close();
    }
}