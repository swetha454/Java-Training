import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long copy=n;
        long ld,rev=0;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        if(rev==copy)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
