package Arrays.Unidimensionales;

import java.util.Scanner;

public class Ciudades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas ciudades has visitado?");
        int cantidadCiudades = sc.nextInt();
        sc.nextLine();

        String[] cantCiu = new String[cantidadCiudades];

        System.out.println("Ingrese los nombres de las ciudades: ");
        for (int i = 0; i < cantCiu.length; i++){
            System.out.println("Ciudad " + (i + 1) + ": ");
            cantCiu[i] = sc.nextLine();
        }

        System.out.println("Las ciudades que has visitado son: ");
        for (String ciudades : cantCiu){
            System.out.println(ciudades);
        }

        sc.close();
    }   
}