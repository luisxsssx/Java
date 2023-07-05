package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();

        System.out.println("Ingrese los elementos que desee agregar a la lista(cuando desee terminar solo ponga la palabra 'fin'): ");

        while (true) {
            String elemento = sc.nextLine();
            if (elemento.equals("fin")) {
                break;
            }
            lista.add(elemento);
        }

        System.out.println("La lista ingresada es: " + lista);

        sc.close();
    }
}