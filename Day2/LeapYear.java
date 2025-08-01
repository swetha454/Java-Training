import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeapYear {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if(y%4==0 && y%100!=0 || y%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        
    }
}
