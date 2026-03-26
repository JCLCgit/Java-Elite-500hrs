package _03Cadenas;

public class Cadenas {
    public static void main(String[] args){
        System.out.println("***MANEJO DE CADENAS EN JAVA***");
        var cadena1 = "Jurassic";
        var cadena2 = new String("Jurassic Park");
        var cadena3 = cadena1 + " " + cadena2;
        var cadena4 = """
                Hola a todos
                amantes de las películas de
                Jurassic Park
                """;
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena3 = " + cadena3);
        System.out.println("cadena4 = " + cadena4);
    }
}
