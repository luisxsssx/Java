package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();

        System.out.println("Ingrese la cantidad de elementos que desea agregar a la lista");
        int cantidadElementos = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese lo que desea agregar a la lista: ");

        for (int i = 0; i < cantidadElementos; i++){
            String elementos = sc.nextLine();
            lista.add(elementos);
        }

        System.out.println("La lista ingresada es: " + lista);

        sc.close();
    }   
}