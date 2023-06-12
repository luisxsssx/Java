package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class descuentoCompra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el total de la compra");
        double costoTotal = sc.nextDouble();

        double descuento = 0.0;

        if(costoTotal >= 100 && costoTotal < 200){
            descuento = costoTotal * 0.10;
        } if(costoTotal >= 200 && costoTotal < 500){
            descuento = costoTotal * 0.20;
        } if(costoTotal >= 500){
            descuento = costoTotal * 0.30;
        }

        double costoFinal = costoTotal - descuento;

        System.out.println("El descuento de la compra fue: " + descuento);
        System.out.println("El costo final es: " + costoFinal);

        sc.close();
    }   
}