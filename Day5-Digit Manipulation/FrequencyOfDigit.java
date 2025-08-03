import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit=sc.nextInt();
        int count=0;
        int ld;
        while(num>0){
            ld=num%10;
            if(ld==digit){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
    
}
