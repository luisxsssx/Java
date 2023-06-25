package Arrays;

import java.util.Scanner;

public class AccesoSecuencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vectorOriginal = {1, 2, 3, 5};
        System.out.println("Ingrese el nuevo número que desea agregar: ");
        int nuevoElemento =  sc.nextInt();

        int nuevoTamaño = vectorOriginal.length + 1;
        int[] nuevoVector = new int[nuevoTamaño];

        for (int i = 0; i < vectorOriginal.length; i++) {
            nuevoVector[i] = vectorOriginal[i];
        }

        nuevoVector[nuevoTamaño - 1] = nuevoElemento;

        for (int i = 1; i < nuevoVector.length; i++) {
            int elementoActual = nuevoVector[i];
            int j = i - 1;

            while (j >= 0 && nuevoVector[j] < elementoActual) {
                 nuevoVector[j + 1] = nuevoVector[j];
                 j--;
            }


            nuevoVector[j + 1] = elementoActual;

        }



        sc.close();
    }   
}