package _10funciones;

import java.util.Random;

public class _03FuncionPar {

    static String esParClasica (int numero){
        String mensaje;
        if(numero % 2 == 0)
            mensaje = "Es PAR";
        else
            mensaje = "Es IMPAR";
        return mensaje;
    }
    /*static String esParCompacto (int numero){
        String mensaje;
        mensaje = (numero % 2 == 0) ? "Es PAR": "Es IMPAR";
        return mensaje;
    }*/
    static String esParCompacto (int numero){

        return (numero % 2 == 0) ? "Es PAR": "Es IMPAR";
    }

    public static void main(String[] args) {
        System.out.println("**Es Par a través de funciones**");
        Random aleatorio = new Random();
        var numero = aleatorio.nextInt(11);
        var numeroDos = aleatorio.nextInt(11)+90;
        String resultado = esParClasica(numero);

        System.out.printf("%nresultado(%d)= %s",numero, resultado);
        resultado = esParCompacto(numeroDos);
        System.out.printf("%nresultado(%d)= %s",numeroDos, resultado);
    }
}
