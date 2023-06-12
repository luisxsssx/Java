package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class costoBoleto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if(edad < 12){
            System.out.println("Hola " + nombre + " cómo su edad es menor de 12 años, el costo de su boleto es de: $5");
        } else if(edad >= 12 && edad < 18){
            System.out.println("Hola " + nombre + " el costo de su boleto es de $8");
        } if(edad > 18){
            System.out.println("Hola " + nombre + " cómo es mayor de edad es de $10");
        }

        sc.close();
    }   
}