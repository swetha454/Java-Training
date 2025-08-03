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
        boolean isPrime=false;
        for(int i=2;i<=n;i++){
            if(n!=2){
                if(n%i==0){
                    break;
                }
                else{
                    isPrime=true;
                }
            }
            else{
                isPrime=true;
            }
            
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
