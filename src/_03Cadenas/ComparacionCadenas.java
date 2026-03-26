package _03Cadenas;

public class ComparacionCadenas {
    public static void main(String[] args){
        var cadena1 = "JCLC";
        var cadena2 = "JCLC ";
        var cadena3 = "JCLC";
        var cadena4 = new String("JCLC");
        //Comparación de cadenas (==) compara referencia
        System.out.print("Referencia cadena1 es igual a cadena2? -->");
        System.out.println(cadena1==cadena2);
        System.out.print("Referencia cadena1 es igual a cadena3? -->");
        System.out.println(cadena1==cadena3);
        System.out.print("Referencia cadena3 es igual a cadena4? -->");
        System.out.println(cadena1==cadena4);
        System.out.print("CONTENIDO cadena1 es igual a cadena 3 y 4 -->");
        System.out.println(cadena1.equals(cadena3)&&cadena1.equals(cadena4));
    }
}
