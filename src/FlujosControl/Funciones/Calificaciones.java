/*package FlujosControl.Funciones;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la carrera: ");
        String nombreCarrera = sc.nextLine();
        System.out.println("Ingrese el nombre del alumno: ");
        String nombreAlumno = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de materias que esta cursando: ");
        int cantidadMaterias = sc.nextInt();

        int sumaCalificaciones = 0;

        for (int i = 1; i <= cantidadMaterias; i++){
            System.out.println("Ingrese la calificaion de la materia : " + i + ":");
            double calificaionMateria = sc.nextDouble();
            sumaCalificaciones += calificaionMateria;
        }

        double promedioAlumno =

        sc.close();
    }   

    /*public static double promedioAlumno(){
        
    }
}*/