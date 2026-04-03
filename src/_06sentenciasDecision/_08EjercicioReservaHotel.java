package _06sentenciasDecision;

import java.util.Scanner;

public class _08EjercicioReservaHotel {
    public static void main(String[] args) {
        System.out.println("**Reserva de Hotel**");
        final float VISTA_AL_MAR = 190.5F;
        final float SIN_VISTA_AL_MAR = 150.5F;

        var scanner = new Scanner(System.in);
        System.out.print("Nombre del huésped: ");
        var nombre = scanner.nextLine();
        System.out.print("¿Cuántos días se hospeda? ");
        var diasEstadia = Integer.parseInt(scanner.nextLine());
        System.out.print("¿Quiere cuarto con vista al mar? (true/false) ");
        var hasVista = Boolean.parseBoolean(scanner.nextLine());
        float totalPagar;
        String vista;
        if (hasVista){
            totalPagar = diasEstadia * VISTA_AL_MAR;
            vista = "CON VISTA AL MAR";
        }else{
            totalPagar = diasEstadia * SIN_VISTA_AL_MAR;
            vista = "SIN VISTA AL MAR";
        }
        System.out.printf("""
                \n_______________________
                Su reserva:\s
                Estimad@ %s, el costo de su habitacón %s es de:
                %.2f
                """,nombre,vista,totalPagar);


    }
}
