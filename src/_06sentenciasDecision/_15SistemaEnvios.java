package _06sentenciasDecision;

public class _15SistemaEnvios {
    public static void main(String[] args) {
        final var PRECIO_NACIONAL = 10.0;
        final var PRECIO_INTERNACIONAL = 20.0;
        System.out.println("**SISTEMA DE ENVÍOS**");
        var destino = (int) (Math.random()*(10+1));
        var masaPaquete = Math.random()*10+1;
        var destinoTexto = "";
        double precio = 0.0D;
        if (destino % 2 == 0) {
            destinoTexto = "NACIONAL";
            precio = masaPaquete * PRECIO_NACIONAL;
        }
        else {
            destinoTexto = "INTERNACIONAL";
            precio = masaPaquete * PRECIO_INTERNACIONAL;
        }

        System.out.printf("""
               \n________________
               Datos de envío:
               El destino es %s
               El peso de su paquete es %.2f kg
               El precio a pagar es de $%.2f
                """,destinoTexto,masaPaquete,precio);

    }
}
