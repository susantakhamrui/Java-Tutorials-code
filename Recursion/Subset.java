package Recursion;

import java.util.ArrayList;

public class Subset {
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i));
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printsubset(subset);
            return;
        }

        // To Added
        subset.add(n);
        findSubset(n - 1, subset);

        // Not To be Added
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String args[]) {

        int n = 3;

        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
