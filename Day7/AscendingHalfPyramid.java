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
        int val=2*n;
        for(int i=1;i<=val;i++){
            int row=(i<=n)?i:2*n-i+1;
            for(int col=1;col<=n;col++){
                if(col==1){
                    System.out.print("*");
                }
                else if(col<=row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
