import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long reverse(long n){
        long copy=n;
        long ld,rev=0;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        return rev;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long n_square=n*n;
        long n_rev=reverse(n);
        long n_square_rev=n_rev*n_rev;
        long rev=reverse(n_square_rev);
        if(rev==n_square){
            System.out.println("Adam Number");
        }
        else{
            System.out.println("Not a adam number");
        }
    }
}
