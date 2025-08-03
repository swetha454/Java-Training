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
        int mid;
        if(n%2!=0){
            mid=(n+1)/2;
        }
        else{
            mid=(n+1+1)/2;
        }
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==mid || col==mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
