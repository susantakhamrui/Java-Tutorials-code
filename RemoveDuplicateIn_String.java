
public class RemoveDuplicateIn_String {
    public static boolean[] map = new boolean[26];

    public static void printStringInLast(int idx, String Str, String newString) {

        if (idx == Str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = Str.charAt(idx);
        if (map[currentChar - 'a'] == true) {

            printStringInLast(idx + 1, Str, newString);
        } else {
            newString += currentChar;
            map[currentChar - 'a'] = true;
            printStringInLast(idx + 1, Str, newString);
        }

    }

    public static void main(String[] args) {

        String Str = "sxusxanxtxa";
        printStringInLast(0, Str, "");

    }
}
