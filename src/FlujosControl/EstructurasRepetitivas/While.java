package FlujosControl.EstructurasRepetitivas;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de donde quiere iniciar: ");
        int contador = sc.nextInt();

        System.out.println("Ingrese el numero del tope :");
        int tope = sc.nextInt();

        while(contador < tope){
            System.out.println("Contador " + contador);
            contador++;
        }


        sc.close();
    } 
}