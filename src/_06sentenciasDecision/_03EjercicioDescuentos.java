package _06sentenciasDecision;

import java.util.Scanner;

public class _03EjercicioDescuentos {
    public static void main(String[] args) {
        System.out.println("**Tienda de descuentos**");
        var scanner = new Scanner(System.in);

        System.out.print("Ingresa tu cantidad de compra: ");
        var monto = Float.parseFloat(scanner.nextLine());
        System.out.print("Es miembro? (true/false): ");
        var isMiembro = Boolean.parseBoolean(scanner.nextLine());

        if(monto >= 1000.0 && isMiembro){
            monto *= .9;
            System.out.printf("Su monto a pagar es de %.2f", monto);
        } else if (isMiembro) {
            monto *= .95;
            System.out.printf("Su monto a pagar es de %.2f", monto);
        }else {
            System.out.println("No recibe descuento, su monto a pagar es total");
        }


    }
}
