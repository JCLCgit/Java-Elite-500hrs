package _08arreglos;

public class _01Arreglos {
    public static void main(String[] args) {
        int[] arreglos = new int[4];
        int[] arregloDos = {100,200,300};
        var arregloTres = new int[]{50,70,80};
        arreglos[0] = 2;
        arreglos[1] = 4;
        arreglos[2] = 7;
        arreglos[3] = 9;

        System.out.println("Valor 1 ->" + arreglos[0]);
        System.out.println("Valor 2 ->" + arreglos[1]);
        System.out.println("Valor 3 ->" + arreglos[2]);
        System.out.println("Valor 4 ->" + arreglos[3]);

        for (int i = 0; i < arregloDos.length; i++) {
            System.out.println("Valor 1 ->" + arregloDos[i]);
        }
        for (int i = 0; i < arregloTres.length; i++) {
            System.out.println("Valor 1 ->" + arregloTres[i]);
        }
    }
}
