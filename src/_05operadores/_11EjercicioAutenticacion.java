package _05operadores;

import java.util.Scanner;

public class _11EjercicioAutenticacion {
    public static void main(String[] args) {
        final String USUARIO = "JCLC";
        final String CONTRASENA = "abc56";
        System.out.println("**Autenticación de Sistema");
        var scanner = new Scanner(System.in);
        System.out.print("Ingresa tu usuario: ");
        var usuarioIngresado = scanner.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        var contrasenaIngresada = scanner.nextLine();

        var acceso = (usuarioIngresado.equals(USUARIO)) && (contrasenaIngresada.equals(CONTRASENA));
        System.out.println("Su acceso es:  " + acceso);

    }
}
