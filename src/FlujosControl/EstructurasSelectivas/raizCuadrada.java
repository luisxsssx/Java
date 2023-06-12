package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class raizCuadrada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();


        if(numero >= 0){
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
        } else {
            double raizCuadrada = Math.sqrt(Math.abs(numero));
            String resultado = raizCuadrada + "i";
            System.out.println("El resultado de la raíz cuadrada de " + numero + " es " + resultado);
        }

        sc.close();
    }  
}