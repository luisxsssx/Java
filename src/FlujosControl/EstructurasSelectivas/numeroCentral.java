package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class numeroCentral {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        int numMayor = Math.min(Math.min(num1, num2), num3);
        int numMenor = Math.min(Math.min(num1,num2),num3);
        int medio = num1 + num2 + num3 - numMenor - numMayor;

        if(medio > numMenor && medio < numMayor){
            System.out.println(medio +"es un número central");
        } else {
            System.out.println("No hay número central");
        }

        sc.close();
    }   
}