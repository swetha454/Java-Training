import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1,ld;
        while(n>0){
            ld=n%10;
            mul=mul*ld;
            n/=10;
        }
        System.out.println(mul);
    }
}
