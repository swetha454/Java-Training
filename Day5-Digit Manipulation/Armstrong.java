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
        long ld;
        long sum=0,cube=1,pow=0;
        while(n>0){
            pow++;
            n/=10;
        }
        // System.out.println(pow);
        n=copy;
        while(n>0){
            ld=n%10;
            cube=1;
            for(int i=1;i<=pow;i++)
                cube*=ld;
            sum=sum+cube;
            n=n/10;
        }
        // System.out.println(sum);
        if(copy==sum)
          System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
