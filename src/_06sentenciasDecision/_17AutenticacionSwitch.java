package _06sentenciasDecision;

import java.util.Scanner;

public class _17AutenticacionSwitch {
    public static void main(String[] args){

        final String ADMINISTRADOR = "admin";
        final String CONTRASENIA = "123";
        System.out.println("**Autenticación con SWITCH**");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el usuario: ");
        var usuarioIngresado = scanner.nextLine().strip();
        System.out.print("Ingresa la constrasenia usuario: ");
        var contraseniaIngresada = scanner.nextLine().strip();

        var mensajeIngreso = switch (usuarioIngresado){
            case ADMINISTRADOR -> {
                if (CONTRASENIA.equals(contraseniaIngresada))
                    yield "BIENVENIDO";
                else
                    yield "Usuario CORRECTO, Contraseña INCORRECTA";
            }
            default -> {
                if (CONTRASENIA.equals(contraseniaIngresada))
                    yield "Contraseña CORRECTA, Usuario INCORRECTO";
                else
                    yield "DATOS INVÁLIDOS";
            }
        };
        System.out.println("mensajeIngreso = " + mensajeIngreso);
    }
}
