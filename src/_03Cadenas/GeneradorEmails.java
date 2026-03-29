package _03Cadenas;

public class GeneradorEmails {
    public static void main(String[] args){
        var nombreCompleto = "   Juan Carlos Lopez Carrillo  ";
        var nombreEmopresa = " Tacos Mundiales   ";
        var extensionDominio = ".com.mx";

        nombreCompleto = nombreCompleto.trim().toLowerCase().replace(" ",".");
        nombreEmopresa = nombreEmopresa.trim().toLowerCase().replace(" ",".");

        StringBuilder emailGenerado = new StringBuilder();

        emailGenerado.append(nombreCompleto).append("@").append(nombreEmopresa).append(extensionDominio);
        System.out.println("emailGenerado = " + emailGenerado);
    }
}
