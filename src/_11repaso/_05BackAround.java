package _11repaso;

public class _05BackAround {

    static String copiaPega(String cadena){
        String subcadena = cadena.substring(cadena.length()-1);
        return  subcadena + cadena + subcadena;
    }
    public static void main(String[] args) {
        String cadena = "Juan Carlos";
        System.out.println("cadena = " + copiaPega(cadena));


    }
}
