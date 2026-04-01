package _05operadores;

public class _3OperadoresAsignacion {
    public static void main(String[] args) {

        var numero = 1;
        int numeroDos;
        numeroDos = 5;
        //Asignación Compuesta

        numero += 10;
        System.out.println("numero = " + numero);
        numeroDos *= 3;
        System.out.println("numeroDos = " + numeroDos);
        numeroDos -= 2;
        System.out.println("numeroDos con RESTA = " + numeroDos);
    }
}
