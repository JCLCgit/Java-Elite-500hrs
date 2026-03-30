package _04manejoConsola;

import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args){
        System.out.println("***GENERADOR ID***");
        var consola = new Scanner(System.in);
        var aletorio = new Random();

        System.out.print("Dame tu NOMBRE: ");
        var nombre = consola.nextLine();
        System.out.print("Dame tu APELLIDO: ");
        var apellido = consola.nextLine();
        System.out.print("Dame tu año de nacimiento: ");
        var anioNacimiento = consola.nextLine();

        var numeroAletorio = aletorio.nextInt(9999)+1;
        System.out.println("numeroAletorio GEMERADO = " + numeroAletorio);
        nombre = nombre.strip().toUpperCase().substring(0,2);
        apellido = apellido.strip().toUpperCase().substring(0,2);
        anioNacimiento = anioNacimiento.strip().substring(2);
        var id = String.format("""
                \n-----------------
                ID GENERADO:
                \t%s%s%s%04d
                """,nombre,apellido,anioNacimiento,numeroAletorio);
        System.out.println(id);
    }
}
