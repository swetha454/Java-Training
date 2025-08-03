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
        int mid=(1+n)/2;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(n%2==0){
                    if(col==mid || row==mid || col==mid+1 || row==mid+1)
                      System.out.print("0");
                    else
                     System.out.print("1");
                }
                else{
                    if(col==mid || row==mid )
                      System.out.print("0");
                    else
                     System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
