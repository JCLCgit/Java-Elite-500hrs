package _03Cadenas;

public class ManejoSubcadenas {
    public static void main(String[] args){

        var cadenaPrincipal = "Tlatoani Moctezuma";
        System.out.println("cadenaPrincipal = " + cadenaPrincipal);
        //Subcadena
        var subCadena = cadenaPrincipal.substring(0,8);
        System.out.println("subCadena = " + subCadena);
        var subCaadena2 = cadenaPrincipal.substring(9);
        System.out.println("subCaadena2 = " + subCaadena2);

    }
}
