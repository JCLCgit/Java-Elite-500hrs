package _06sentenciasDecision;

import java.util.Scanner;
// no es menor de 10 años
// no le da miedo la obscuridad
public class _05CasaEspejos {
    public static void main(String[] args) {
        System.out.println("**Casa de los espejos**");
        var scanner = new Scanner(System.in);
        System.out.print("Tienes miedo a la obscuridad? (true/false) ");
        var hasFear = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Tienes menos de 10 años de edad? (true/false) ");
        var hasAge = Boolean.parseBoolean(scanner.nextLine());

        if(!hasAge && !hasFear){
            System.out.println("¡BIENVENIDO!");
        } else if (!hasAge || !hasFear) {
            System.out.println("Lo siento NO puede entrar, no cumples 1 de los requisitos");
        }else{
            System.out.println("Lo siento, no cumples ningún requisito");
        }

    }
}
