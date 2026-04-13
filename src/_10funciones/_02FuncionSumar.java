package _10funciones;

public class _02FuncionSumar {

    static float sumar(float a, float b){
        float resultado = a + b;
        return resultado;
    }
    public static void main(String[] args) {

        float x = 5, y = 12, resultadoSuma;
        resultadoSuma= sumar(x,y);
        System.out.println("resultadoSuma = " + resultadoSuma);
    }
}
