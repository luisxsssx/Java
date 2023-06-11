package Estructuras;

// Ejemplo de estructura selectiva para detectar si un número tiene o no parte fraccionaria

import java.util.Scanner;

public class numeroFraccionario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();

        if (numero % 1 != 0) {
            System.out.println("El número tiene parte fraccionaria");
        } else {
            System.out.println("El número no tiene parte fraccionaria40");
        }

        
        sc.close();
    }    
}