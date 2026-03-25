package _02variables;

public class TiendaLinea {
    public static void main(String[] args){
        //Detalle de mi producto en tienda
        System.out.println("***Tienda en línea***");
        String nombreProducto = "Laptop Asus";
        float precio = 6005.34F;
        int cantidadDisponible = 12;
        boolean disponibleVenta = true;
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

        nombreProducto = "HP";
        precio = 5000;
        cantidadDisponible = 3;
        disponibleVenta = false;
        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);


    }
}
