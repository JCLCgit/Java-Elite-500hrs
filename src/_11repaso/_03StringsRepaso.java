package _11repaso;

public class _03StringsRepaso {

    static String crearMensaje(String carecteres, String mensaje){

        return carecteres.substring(0, 2) + mensaje + carecteres.substring(2, 4);

    }
    public static void main(String[] args) {

        String mensaje = "Me llamo Juan Carlos";
        var resultado = crearMensaje("{{}}",mensaje);
        System.out.println("resultado = " + resultado);
    }
}
