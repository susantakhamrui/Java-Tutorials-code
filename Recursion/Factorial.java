package Recursion;

import java.util.Scanner;

public class Factorial {
    // public static void printFib(int a, int b, int n) { <Fibonacci Series With
    // Recursion>
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // printFib(b, c, n - 1);
    // }

    // public static void main(String[] args) {
    // int a = 0, b = 1;

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter The Length Of Fibonacci Series = ");
    // int n = sc.nextInt();
    // System.out.println(a);
    // System.out.println(b);
    // printFib(a, b, n - 2);
    // }
    // }
    // public static int calculatePower(int i, int n) { Calculate Power In Recursion
    // if (n == 0) {
    // return 1;
    // }
    // if (i == 0) {
    // return 0;
    // }
    // if (n % 2 == 0) {
    // return calculatePower(i, n / 2) * calculatePower(i, n / 2);
    // } else {
    // return calculatePower(i, n / 2) * calculatePower(i, n / 2) * i;
    // }

    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter The Value of X ");
    // int i = sc.nextInt();
    // System.out.println("Enter The Power Value of X ");
    // int n = sc.nextInt();
    // System.out.println("The Value of " + i + " to The Power " + n + " = " +
    // calculatePower(i, n));
    // }
    // Tower Of Hanoi
    /*
     * public static void printTowerOfHanoi(int n, String scr, String helper, String
     * dest) {
     * if (n == 0) {
     * // System.out.println("Transfer Disk " + n + " from " + scr + " to " + dest);
     * return;
     * }
     * printTowerOfHanoi(n - 1, scr, dest, helper);
     * System.out.println("Transfer Disk " + n + "  from " + scr + " to " + helper);
     * printTowerOfHanoi(n - 1, dest, helper, scr);
     * System.out.println();
     * }
     * 
     * public static void main(String arg[]) {
     * 
     * int n = 3;
     * printTowerOfHanoi(n, "Source", "Helper", "Destination");
     * }
     */

    // Print a String

    /*
     * public static void printReverseString(String str, int idx) {
     * if (idx < 0) {
     * return;
     * }
     * System.out.println(str.charAt(idx));
     * printReverseString(str, idx - 1);
     * 
     * }
     * 
     * public static void main(String arg[]) {
     * 
     * String str = "5500799479";
     * printReverseString(str, str.length() - 1);
     * }
     */

    // public static void printFib(int a, int b, int n) {

    // if (n == 25) {
    // return;
    // }
    // int i = a + b;
    // System.out.println(i);
    // printFib(b, i, n + 1);

    // }

    // public static void main(String[] args) {

    // int n = 25;
    // int a = 1, b = 1;
    // System.out.println(a);
    // System.out.println(b);
    // printFib(a, b, 2);
    // }








   /* public static void printStringInLast(int idx, int count, String Str, String newString) {

        if (idx == Str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = Str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            printStringInLast(idx + 1, count, Str, newString);
        } else {
            newString += currentChar;
        }

    }

    public static void main(String[] args) {

        String Str = "sxusxanxtxa";
        printStringInLast(0, 0, Str, " ");
    }
}
*/