package Recursion;

import java.util.HashSet;

public class UniqueSubsequence {
    public static void UniqueSubSequence(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentChar = str.charAt(idx);

        // To Be Selected
        UniqueSubSequence(str, idx + 1, newString + currentChar, set);

        // NOt To Be Selected
        UniqueSubSequence(str, idx + 1, newString, set);

    }

    public static void main(String arg[]) {

        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        UniqueSubSequence(str, 0, "", set);
    }
}
