import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size = 2 * n;      // Total rows and columns

        for (int i = 0; i < size; i++) {
            int row = (i < n) ? i : (2 * n - i - 1);
            for (int j = 0; j < size; j++) {
                if (j < n - row || j >= n + row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
