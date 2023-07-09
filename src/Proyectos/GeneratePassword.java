package Proyectos;

import java.security.SecureRandom;
import java.util.Scanner;

public class GeneratePassword {

    private static final String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789,./*Ññ1234567891011121314560";
    private static SecureRandom random = new SecureRandom();


    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randonIndex = random.nextInt(CHARSET.length());
            password.append(CHARSET.charAt(randonIndex));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud deseda para la contraseña: ");
        int length = sc.nextInt();

        String password = generatePassword(length);
        System.out.println("Contraseña generada: " + password);

        sc.close();
    }
}