package _11repaso;

public class _07HasTeen {
    static boolean hasTeen (int a, int b, int c){
        return ((a >= 13 && a <=19)||(b >= 13 && b <=19)||(c >= 13 && c <=19) );

    }
    public static void main(String[] args) {

        int a = 14, b = 9, c = 1;
        System.out.println("función es = " + hasTeen(a,b,c) );
        a = 3;
        System.out.println("función es = " + hasTeen(a,b,c) );
        a = 15;
        b = 13;
        c = 17;
        System.out.println("función es = " + hasTeen(a,b,c) );


    }
}
