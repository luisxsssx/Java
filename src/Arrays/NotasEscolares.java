package Arrays;

import java.util.Scanner;

// Gestión de calificaciones academicas

public class NotasEscolares {   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] materias = {"Ingeniería de software III", "Base de datos", "Programación web", "Probabilidad y estadistica", "Calidad de software"};

        System.out.println("Ingrese el número de alumnos: ");
        int numeroAlumnos = sc. nextInt();

        double[][] calificaciones = new double[numeroAlumnos][materias.length]; 

        for (int i = 0; i < numeroAlumnos; i++){ 
            System.out.println("Inngrese las calificaciones del alumno " + (i + 1) + ": ");
            for (int j = 0; j < materias.length; j++){
                System.out.println("Ingrese las calificaciones de " + materias[j] + ": ");
                calificaciones[i][j] = sc.nextDouble();
            }
        }

        double promedio = promedioAlumnos(calificaciones);
        System.out.println("El promedio del grupo es: " + promedio);

        sc.close();
    }

    public static double promedioAlumnos(double[][] calificaciones) {
        double suma = 0;
        int numeroAlumnos = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
                numeroAlumnos++;
            }
        }
        return suma / numeroAlumnos;
    }


}