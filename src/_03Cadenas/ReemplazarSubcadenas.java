package _03Cadenas;

public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        var cadenaOriginal = "Jurassic Park";
        System.out.println("cadenaOriginal = " + cadenaOriginal);
        var subcadena = "World";
        var nuevaCadena = cadenaOriginal.replace("Park",subcadena);
        System.out.println("nuevaCadena = " + nuevaCadena);
        System.out.println("cadenaOriginal.replace(\"Jurassic\",subcadena) = " + cadenaOriginal.replace("Jurassic",subcadena));
    }
}
