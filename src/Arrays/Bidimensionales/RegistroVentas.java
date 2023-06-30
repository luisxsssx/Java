package Arrays.Bidimensionales;

import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int cantidadProd = sc.nextInt();

        System.out.println("Ingrese la cantidad de días de venta: ");
        int cantidadDias = sc.nextInt();

        int[][] ventas = new int[cantidadProd][cantidadDias];

        for (int i = 0; i < cantidadProd; i++){
            System.out.println("\nProducto " + (i + 1) + ": ");

            for (int j = 0; j < cantidadDias; j++){
                System.out.println("Día " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nTotal de ventas por producto: ");
        for (int i = 0; i < cantidadProd; i++){
            int totalVentas = 0;

            for ( int j = 0; j < cantidadDias; j++){
                totalVentas += ventas[i][j];
            }
            System.out.println("Producto " + (i +1) + ": " + totalVentas);
        }

        sc.close();
    }   
}