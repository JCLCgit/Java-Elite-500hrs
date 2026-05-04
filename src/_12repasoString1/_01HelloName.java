package _12repasoString1;

public class _01HelloName {
    /*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
     */
    static String helloName(String name) {
        String hello = "Hello ";
        String exclamation = "!";

        return hello + name + exclamation;
    }
    public static void main(String[] args) {
        System.out.println("helloName(\"Bob\") = " + helloName("Bob"));
        System.out.println("helloName(\"Alice\") = " + helloName("Alice"));
        System.out.println("helloName(\"X\") = " + helloName("X"));
    }
}
