package _07ciclos;

public class _08SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("**Suma Acumulativa con While**");

        var contador = 1;
        var suma = 0;
        while (contador <= 5){
            suma += contador;
            System.out.printf("\nIteración %d, suma = %d",contador,suma);
            contador++;

        }
    }
}
