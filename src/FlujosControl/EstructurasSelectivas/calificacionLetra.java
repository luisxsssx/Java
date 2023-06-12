package FlujosControl.EstructurasSelectivas;

import java.util.Scanner;

public class calificacionLetra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su calificación: ");
        int calificacion = sc.nextInt();

        if(calificacion >= 90){
            System.out.println("Su calificación es A");
        } if(calificacion < 90 && calificacion >= 80){
            System.out.println("Su calificaión es B");
        } if(calificacion < 80 && calificacion >= 70){
            System.out.println("Su calificación es C");
        } if(calificacion < 70 && calificacion >= 69){
            System.out.println("Su calificación es D");
        } if(calificacion < 69){
            System.out.println("Su calificaión es F, esta reprobado");
        }
        
        sc.close();
    }
}