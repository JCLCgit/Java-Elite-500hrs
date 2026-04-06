package _07ciclos;

public class _02NumerosPares {
    public static void main(String[] args) {
        System.out.println("**Números Pares con ciclo WHILE");
        // Evaluación hasta el 20
        var contador = 0;
        while (contador <= 20){
            if ((contador % 2) == 0)
                System.out.println("contador = " + contador);
            contador++;
        }

    }
}
