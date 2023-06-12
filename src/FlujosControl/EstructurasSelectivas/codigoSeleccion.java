package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class codigoSeleccion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el código de selección: ");
        int codigoSeleccion = sc.nextInt();

        int codigo1 = num1 + num2;
        int codigo2 = num1 * num2;
        int codigo3 = num1 / num2;

        if(codigoSeleccion == 1){
            System.out.println("La operación del código 1 es: " + codigo1);
        }else if(codigoSeleccion == 2){
            System.out.println("La operación del código es: " + codigo2);
        }else if(codigoSeleccion == 3){
            System.out.println("La operación del código es: " + codigo3);
        } else {
            System.out.println("Código de selección inválido");
        }

        sc.close();
    }   
}