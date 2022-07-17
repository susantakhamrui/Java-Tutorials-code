import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(int i) {
        if (i == 0) {
            return true;
        }
        if (i < 0 || i % 10 == 0) {
            return false;
        }
        int rev = 0;
        int temp = i;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rem + rev * 10;
            temp = temp / 10;
        }
        if (rev == i) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(checkPalindrome(i));

    }
}