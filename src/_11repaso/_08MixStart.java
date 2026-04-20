package _11repaso;

public class _08MixStart {
    static boolean mixStart(String cadena){

        return (cadena.strip().substring(1,2).equals("ix"));
    }
    public static void main(String[] args) {

        String cadena = "mix clasicos";

        System.out.println("cadena = " + mixStart(cadena));
        System.out.println("cadena = " + mixStart("mix snacks"));
        System.out.println("cadena = " + mixStart("pix snacks"));
        System.out.println("cadena = " + mixStart("piz snacks"));


    }
}
