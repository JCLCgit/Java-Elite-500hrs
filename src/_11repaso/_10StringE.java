package _11repaso;

public class _10StringE {
    /*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
     */
    static boolean stringE(String str) {
        int contador = 0;
        boolean respuesta;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'e')
                contador++;
        }
        return (contador >= 3) ? true : false;
    }
    public static void main(String[] args) {
        String cadena = "hello";

        stringE(cadena);
        System.out.println("cadena = " + cadena);
    }
}
