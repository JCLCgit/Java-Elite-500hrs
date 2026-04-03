package _06sentenciasDecision;

import java.util.Random;

public class _06OperadorTernario {
    public static void main(String[] args) {
        System.out.println("**Operador Ternario**");

        //evaluacion ? exp1 : exp2
        //Determinar si un número es par o no
        var aletorio = new Random();
        var numero = aletorio.nextInt(10);
        var edad = aletorio.nextInt(100)+1;
        var tipoNumero = aletorio.nextInt(10)-5;

        var isPar = (numero % 2 == 0 ) ? "ES PAR" : "IMPAR";
        System.out.printf("""
                \n------RESULTADO--------
                Número asignado->%d, %s
                """,numero,isPar);

        var isMayor = (edad >= 18 ) ? "ES MAYOR DE EDAD" : "ES MENOR EDAD";
        System.out.printf("""
                \n------MAYOR DE EDAD--------
                Número asignado->%d, %s
                """,edad,isMayor);

        var estado = (tipoNumero > 0) ? "ES POSITIVO" : (tipoNumero < 0) ? "ES NEGATIVO" : "Es CERO" ;
        System.out.printf("""
                \n------POSITIVO NEGATIVO CERO--------
                Número asignado->%d, %s
                """,tipoNumero,estado);

    }
}
