package _11repaso;

public class _06startHi {
    static boolean startHi(String str){

        if(str.substring(0,2).equals("hi"))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String str = "hi lelel";
        String str2 = "no hay";
        boolean respuesta;

        respuesta = startHi(str);
        System.out.println("respuesta = " + respuesta);
        respuesta = startHi(str2);
        System.out.println("respuesta = " + respuesta);


    }
}
