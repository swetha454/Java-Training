import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max=-1;
        while (n1 % 2 == 0) {
            max = 2;
            n1 /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n1); i += 2) {
            while (n1 % i == 0) {
                max = i;
                n1 /= i;
            }
        }
        if (n1 > 2) {
            max = n1;
        }
        if(max<=n2){
            System.out.println("Smooth Number");
        }
        else{
            System.out.println("Not a Smooth Number");
        }
    }
}
