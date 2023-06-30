package Arrays.Bidimensionales;

import java.util.Scanner;

public class EjemploBidimensionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de filas: ");
        int numFilas = sc.nextInt();

        System.out.println("Ingrese el númeo de columnas: ");
        int numColumnas = sc.nextInt();  

        int[][] matriz = new int[numFilas][numColumnas];

        System.out.println("Ingrese los elementos de la matriz: ");
        for (int i = 0; i < numFilas; i++){
            for(int j = 0; j < numColumnas; j++){
                matriz[i][j] = sc.nextInt();
            }
        }       

        System.out.println("La matriz ingresada es: ");
        for (int i = 0; i < numFilas; i++){
            for (int j = 0; j < numColumnas; j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}