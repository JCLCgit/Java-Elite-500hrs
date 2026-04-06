package _06sentenciasDecision;

import java.util.Scanner;

public class _16SistemaAutenticacion {
    public static void main(String[] args) {
        final String ADMINISTRADOR = "admin";
        final String CONTRASENIA = "123";
        System.out.println("**Sistema Autenticación**");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el usuario: ");
        var usuarioIngresado = scanner.nextLine().strip();
        System.out.println("Ingresa la constrasenia usuario: ");
        var contraseniaIngresada = scanner.nextLine().strip();

        if(CONTRASENIA.equals(contraseniaIngresada) && ADMINISTRADOR.equals(usuarioIngresado))
            System.out.println("BIENVENIDO");
        else if (CONTRASENIA.equals(contraseniaIngresada) && !ADMINISTRADOR.equals(usuarioIngresado))
            System.out.println("Contraseña CORRECTA, Usuario INCORRECTO");
        else if (!CONTRASENIA.equals(contraseniaIngresada) && ADMINISTRADOR.equals(usuarioIngresado))
            System.out.println("Usuario CORRECTO, Contrasenia INCORRECTa");
        else
            System.out.println("DATOS INVÁLIDOS");

    }
}
