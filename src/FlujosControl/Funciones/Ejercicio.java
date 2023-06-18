package FlujosControl.Funciones;

import java.util.Scanner;

public class Ejercicio{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        
        double sumaConIva = sumarNumerosConIva(num1, num2);
        
        System.out.println("La suma de los dos números es: " + sumaConIva);

        sc.close();
    }

   public static double sumarNumerosConIva(double num1, double num2) {
        double IVA = 0.21;
        double suma = num1 + num2;
        double sumaConIva= suma + (suma * IVA);
        return sumaConIva;
    }
}