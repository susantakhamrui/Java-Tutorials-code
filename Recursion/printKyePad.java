package Recursion;

public class printKyePad {

    public static String[] keypad = { ".", "abc", "def", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String arg[]) {

        String str = "23";
        printCombination(str, 0, "");

    }

}