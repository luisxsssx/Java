package FlujosControl.EstructurasRepetitivas;

import java.util.Scanner;

public class PromedioEdad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Promedio de edad de un grupo de alumnos");

        System.out.println("Ingrese el tamaño del grupo: ");
        int canAlumnos = sc.nextInt();

        int[] cantidad = new int[canAlumnos];

        System.out.println("Ingrese las edades de los alumnos: ");

        for (int i = 0; i < canAlumnos; i++){
            System.out.println("Edad del alumno " + (i + 1) + ": ");
            cantidad[i] = sc.nextInt();
        }

        int suma = 0;
        for (int num : cantidad){
            suma += num;
        }

        double promedio = (double) suma / cantidad.length;

        System.out.println("El promedio de edad de los alumnos del grupo es: " + promedio);
    
        sc.close();
    }   
}