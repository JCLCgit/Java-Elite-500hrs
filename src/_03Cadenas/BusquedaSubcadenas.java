package _03Cadenas;

public class BusquedaSubcadenas {
    public static void main(String[] args) {
        var cadenaPrincipal = "Peter pan Peter pan";
        System.out.println("cadenaPrincipal.length() = " + cadenaPrincipal.length());
        System.out.println("cadenaPrincipal.indexOf(\"pan\") = " + cadenaPrincipal.indexOf("pan"));
        System.out.println("cadenaPrincipal LAST INDEX  = " + cadenaPrincipal.lastIndexOf("pan"));
    }
}
