package _06sentenciasDecision;

import java.util.Random;

public class _11DiaSemana {
    public static void main(String[] args) {
        System.out.println("**Día de la semana con Switch");
        var aleatorio = new Random();
        var dia = aleatorio.nextInt(8);
        System.out.println("dia = " + dia);
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día Invalido: "+dia);

        }
    }
}
