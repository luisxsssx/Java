package Arrays;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] materias = {"Matemáticas", "Ciencias", "Historia"};

        for (int i = 0; i < materias.length; i++){
            System.out.println("Ingrese la nota de " + materias[i] + ": ");
            double nota = sc.nextDouble();
            System.out.println("Notas de " + materias[i] + ": " + nota);
        }

        sc.close();
    }   
}