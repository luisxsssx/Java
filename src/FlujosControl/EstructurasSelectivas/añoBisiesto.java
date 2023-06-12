package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class añoBisiesto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un año");
        int año = sc.nextInt();

        if(año % 4 == 0){
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }

        sc.close();
    }   
}