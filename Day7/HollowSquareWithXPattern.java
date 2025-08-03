import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int mid=(1+n)/2;
        int start=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==1 || row==n || col==1 || col==n){
                    System.out.print("1");
                }
                else if(row==col || (row+col)==n+1){
                    System.out.print("1");
                }
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
