package _14repasoLogic1;

public class _26FizzString2 {
    /*
Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
Except if the number is divisible by 3 use "Fizz" instead of the number, and
 if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
 Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)
fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
     */
    static String fizzString2(int n) {
        String end = "!";
        String three = "Fizz";
        String five = "Buzz";

        if(n % 3 == 0 && n % 5 == 0)
            return three + five + end;
        if (n % 3 == 0)
            return three + end;
        if (n % 5 == 0)
            return five + end;
        return n + end;
    }
    public static void main(String[] args){
        System.out.println("fizzString2(1) = " + fizzString2(1));
        System.out.println("fizzString2(2) = " + fizzString2(2));
        System.out.println("fizzString2(3) = " + fizzString2(3));
    }
}

