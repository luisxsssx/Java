import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        // Promedios
        Scanner scanner = new Scanner(System.in);

        //Nombre del alumno
        System.out.println("Ingrese el nombre del alumno: ");
        String Alumno = scanner.nextLine();

        System.out.println("Hola " + Alumno + " ingresa el nombre de la carrera");
        String Carrera = scanner.nextLine();

        //Calificaciones
        System.out.println("Calificación 1: ");
        Double Cal1 = scanner.nextDouble();

        System.out.println("Calificación 2: ");
        Double Cal2 = scanner.nextDouble();

        System.out.println("Calificación 3: ");
        Double Cal3 = scanner.nextDouble();

        System.out.println("Calificaión 4:");
        Double Cal4 = scanner.nextDouble();

        System.out.println("Calficación 5: ");
        Double Cal5 = scanner.nextDouble();

        Double CalificacionFinal = (Cal1 + Cal2 + Cal3 + Cal4 + Cal5) / 5;

        System.out.println("Hola" + " " + Alumno + " de la carrera " + Carrera + " su calificacion final es: " + CalificacionFinal);

        scanner.close();
    } 
}