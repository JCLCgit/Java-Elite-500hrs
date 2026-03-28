package _03Cadenas;

public class MasConcatenacionCadenas {
    public static void main(String[] args){
        var cadena1 = "El señor";
        var cadena2 = "de los anillos";
        String cadena3 = null;
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 = " + cadena3);
        
        var cadenaConstruida = new StringBuilder();
        cadenaConstruida.append(cadena1);
        cadenaConstruida.append(" ");
        cadenaConstruida.append(cadena2);
        var resultado = cadenaConstruida.toString();
        System.out.println("cadenaConstruida = " + resultado);

        var cadenaBuffer = new StringBuffer();
        cadenaBuffer.append(cadena1).append("*").append(cadena2).toString();
        System.out.println("cadenaBuffer = " + cadenaBuffer);

        var cadenaJoin = new String();
        cadenaJoin = String.join("-",cadena1,cadena2,cadena3);
        System.out.println("cadenaJoin = " + cadenaJoin);
    }
}
