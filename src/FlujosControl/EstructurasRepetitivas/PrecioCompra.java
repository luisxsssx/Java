package FlujosControl.EstructurasRepetitivas;

import java.util.Scanner;

public class PrecioCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calntidad de productos: ");
        int cantidadProductos = sc.nextInt();

        double[] precios = new double[cantidadProductos];

        System.out.println("Ingrese el nombre de cada producto: ");
        String[] nombreProducto = new String[cantidadProductos];
        sc.nextLine();
        for (int i = 0; i < cantidadProductos; i++){
            nombreProducto[i] = sc.nextLine();
        }

        System.out.println("Ingrese los precios de los prodcutos : ");
        for (int i = 0; i < cantidadProductos; i++){
            System.out.println("Precio de " + nombreProducto[i] + ": ");
            precios[i] = sc.nextDouble();
        }

        // Calcular el total de la compra inclyuendo el 10% de impuesto
        double subtotal = 0;
        for (double precio : precios ){
            subtotal += precio;
        }
        double impuesto = subtotal * 0.1;
        double total = subtotal + impuesto;

        //Operaciones
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuesto (10%): " + impuesto);
        System.out.println("Total: " + total);

        sc.close();
    }   
}