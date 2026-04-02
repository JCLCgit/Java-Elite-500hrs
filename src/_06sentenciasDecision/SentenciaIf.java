package _06sentenciasDecision;

public class SentenciaIf {
    public static void main(String[] args) {
        var edad = 15;

        if (edad >= 18)
            System.out.println("Eres mayor de edad");
        else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolescente");
        } else
            System.out.println("eres menor de edad");
    }
}
