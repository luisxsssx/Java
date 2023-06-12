package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class numerosIguales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Ambos numeros son iguales");
        } else if(num1 < num2) {
            System.out.println("El número 1 es menor que el número 2");
        } if(num1 > num2){
            System.out.println("El número 1 es mayor que el número 2");
        }

        sc.close();
    }   
}