package _11repaso;

public class _03StringsRepaso {

    static String crearMensaje(String mensaje){
        String formato = "<<>>";
        return formato.substring(0, 2) + mensaje + formato.substring(2, 4);

    }
    public static void main(String[] args) {

        String mensaje = "Me llamo Juan Carlos";
        var resultado = crearMensaje(mensaje);
        System.out.println("resultado = " + resultado);
    }
}
