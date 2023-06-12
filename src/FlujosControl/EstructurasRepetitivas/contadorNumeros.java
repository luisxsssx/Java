package FlujosControl.EstructurasRepetitivas;

import java.util.Scanner;

public class contadorNumeros {
    public static void main(String[] args){
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                contador++;
            }
        } while (numero > 0);

        System.out.println("El contador es: " + contador);

        sc.close();
    }   
}