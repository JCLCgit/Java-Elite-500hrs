package _11repaso;

import java.util.Random;

public class _04DistanciaNumeros {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int numero;
        boolean respuesta;
        for (int i = 0; i < 10; i++) {
            numero = aleatorio.nextInt(201) + 1;
            if ( Math.abs(200-numero ) <= 10  || Math.abs(100-numero ) <= 10 ){
                respuesta = true;
            }
            else{
                respuesta = false;
            }
            System.out.printf("%d = %b %n", numero, respuesta);
        }

    }
}
