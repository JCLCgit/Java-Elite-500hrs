package _03Cadenas;

public class MetodosDeCadenas {
    public static void main(String[] args) {
        //largo de una cadena
        var cadena1 = "*padre*nuestro*";
        System.out.println("cadena1.length() = " + cadena1.length());

        var cadenaRemasterizada = cadena1.replace("*"," ");
        System.out.println("cadenaRemasterizada = " + cadenaRemasterizada);
        var cadenaMayus = cadena1.toUpperCase();
        System.out.println("cadenaMayus = " + cadenaMayus);
        System.out.println("cadenaMINUS = " + cadenaMayus.toLowerCase());
        System.out.println("cadenaRemasterizada SIN ESPACIOS= " + cadenaRemasterizada.trim());

    }
}
