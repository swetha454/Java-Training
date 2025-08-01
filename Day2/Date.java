import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Date {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String dateStr=sc.next();
        String[] date=dateStr.split("/");
        int d=Integer.parseInt(date[0]);
        int m=Integer.parseInt(date[1]);
        int y=Integer.parseInt(date[2]);
        if(y>=1900 && y<=9999){
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
                if(d>=1 && d<=31){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
            }
            else if(m==4 || m==6 || m==9 || m==11){
                if(d>=1 && d<=30){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
            }
            else if(m==2){
                if(y%4==0 && y%100!=0 || y%400==0){
                    if(d>=1 && d<=29){
                        System.out.println("Valid");
                    }
                    else{
                        System.out.println("Invalid");
                    }
                }
                else{
                    if(d>=1 && d<=28){
                        System.out.println("Valid");
                    }
                    else{
                        System.out.println("Invalid");
                    }
                }
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
