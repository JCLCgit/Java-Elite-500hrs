package _03Cadenas;

public class IndicesCadenas {
    public static void main(String[] args) {
        //Manejo de índices en una cadena
        var cadena1 = "Jurassic Park";
        System.out.println("Largo de cadena1 = " + cadena1.length());
        var charInicial = cadena1.charAt(0);
        var charFinal = cadena1.charAt(cadena1.length()-1);

        System.out.println("charInicial = " + charInicial);
        System.out.println("charFinal = " + charFinal);
    }
}
