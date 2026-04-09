package _07ciclos;

import java.util.Scanner;

public class _12ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("**Validación Contraseña**");
        var contrasenia = "";
        var sistemaPrendido = false;
        var scanner = new Scanner(System.in);

        while (!sistemaPrendido){
            System.out.print("Por favor ingresa la contraseña a crear: ");
            contrasenia = scanner.nextLine();

            contrasenia= contrasenia.strip();
            var largoMinimo = contrasenia.length();
            if (largoMinimo >= 6){
                System.out.println("Contraseña Válida. Gracias");
                sistemaPrendido = true;
            }
            else
                System.out.println("Largo de contraseña no suficiente");
        }


    }
}
