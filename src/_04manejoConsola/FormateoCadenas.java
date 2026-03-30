package _04manejoConsola;

public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("***Formateo de Cadenas***");
        System.out.println("**Utilizando String.format" +
                "y printf**");
        var nombre = "JCLC";
        var edad = 32;
        var salario = 37500.8556;

        var mensajeSalida = String.format("Nombre: %s, Edad: %d, " +
                "Salario: %.2f", nombre,edad,salario);
        System.out.println("mensajeSalida = " + mensajeSalida);

        System.out.printf("Nombre: %s, Edad: %d," +
                          "Salario: %.2f\n", nombre,edad,salario);

        //Text Block
        var numeroEmpleaod = 27;
        System.out.printf("""
                \nDetalle persona:\s
                \tNombre: %s
                \tEdad: %d
                \tN. empleado: %05d
                \tSalario: $%.3f
                """,nombre,edad,numeroEmpleaod,salario);

    }
}
