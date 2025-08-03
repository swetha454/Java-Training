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
        int i=2;
        int flag=0;
        while(i<=n){
            if(i==n){
                flag=1;
            }
            i=i*2;
        }
        if(flag == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
