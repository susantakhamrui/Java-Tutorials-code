package Recursion;

public class Matrix {

    // public static int countPaths(int i, int j, int n, int m) {
    // if (i == n || j == m) {
    // return 0;
    // }
    // if (i == n - 1 && j == m - 1) {

    // return 1;
    // }
    // // Move Downwards
    // int downPaths = countPaths(i + 1, j, n, m);
    // // Rigth Path
    // int righthPaths = countPaths(i, j + 1, n, m);
    // return (downPaths + righthPaths);

    // }

    public static void main(String args[]) {

        int n = 4, m = 2;
        int ans = placeTiles(n, m);
        System.out.println(ans);

    }

    public static int placeTiles(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // Vertically
        int vertically = placeTiles(n - m, m);
        // Horizontal
        int Horizontal = placeTiles(n - 1, m);
        return (vertically + Horizontal);
    }

}
