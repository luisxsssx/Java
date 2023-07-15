package EstructurasDeDatos.TablasHash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class palabras {
    public static void main(String[] args) {
        
        HashMap<String, Integer> TablasHash = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una oriación: ");
        String oracion = sc.nextLine();

        String[] palabras = oracion.split(" ");

        for(String palabra : palabras) {
            if(TablasHash.containsKey(palabra)) {
                int frecuencia = TablasHash.get(palabra);
                TablasHash.put(palabra, frecuencia + 1);
            } else {
                TablasHash.put(palabra, 1);
            }
        }

        TreeMap<String, Integer> mapaOrdenado = new TreeMap<>(TablasHash);

        System.out.println("Palabras y su frecuencia: ");
        for(Map.Entry<String, Integer> entry : mapaOrdenado.entrySet()){
            String palabra = entry.getKey();
            int frecuencia = entry.getValue();
            System.out.println(palabra + ": " + frecuencia);   
        }

        sc.close();
    }   
}