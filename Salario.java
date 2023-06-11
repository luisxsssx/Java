// Salario neto de trabajador con estructura secuencial

import java.util.Scanner;

public class Salario {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String Nombre = sc.nextLine();
        
        System.out.println("Ingrese el precio de las horas:");
        double precioHoras = sc.nextDouble();

        System.out.println("Ingrese el total de horas trabajadas:");
        double totalHoras = sc.nextDouble();

        double impuesto = 0.20;

        double salarioBruto = totalHoras * precioHoras;
        double impuestoTotal = impuesto * salarioBruto;
        double salarioNeto = salarioBruto - impuestoTotal;

        System.out.println("Hola " + Nombre + " su salario neto es de " + salarioNeto);

        sc.close();
    }
}