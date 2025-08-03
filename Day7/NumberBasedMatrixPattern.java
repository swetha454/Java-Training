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
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n+1;col++){
                if(row%2==0 && col==1){
                    System.out.print(row+1+" ");
                }
                else if(row%2!=0 && col==n+1){
                    System.out.print(row+1+" ");
                }
                else{
                    System.out.print(row+" ");
                }
            }
            System.out.println();
        }
    }
}
