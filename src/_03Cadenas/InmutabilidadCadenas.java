package _03Cadenas;

public class InmutabilidadCadenas {
    public static void main(String[] args) {
        //Inmutabilidad de Cadenas
        var cadena1 = "Apuntador 1";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Referencia de contenido diferente";
        System.out.println("cadena1 MODIFICADA= " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
