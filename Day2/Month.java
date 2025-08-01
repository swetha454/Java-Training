import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Month {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        if(n>0 && n<=12 )
            System.out.println(month[n-1]);
        else{
            System.out.println("Invalid");
        }
    }
}
