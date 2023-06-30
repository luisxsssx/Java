/*0package Arrays.Bidimensionales;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número total de alumnos en la clase: ");
        int numeroAlumnos = sc.nextInt();

        System.out.println("Ingrese el número total de asignaturas: ");
        int numeroMaterias = sc.nextInt();

        double[][] notas = new double[numeroAlumnos][numeroMaterias];
        double[][] creditos = new double[numeroAlumnos][numeroMaterias];

        for (int i = 0; i < numeroAlumnos; i++){
            System.out.println("Alumno #" + (i + 1));
            ingresarNotas(sc, notas, i);
            ingresarCreditos(sc, creditos, i);
        }

        for (int i = 0; i < numeroAlumnos; i++){
            double mediaAlumno = calcularMediaAlumnos(notas)
        }

        sc.close();
    }  

    private static double ingresarNotas(Scanner sc, double[][] notas, double[][] creditos){
        double sumaMedias = 0;
        int numeroAlumnos = notas.length;

        for (int i = 0; i < numeroAlumnos; i++){
            double mediaAlumno = calcularMediaAlumnos(notas, creditos, i);
            sumaMedias += mediaAlumno;
        }
        return sumaMedias / numeroAlumnos;
    }
    
}*/