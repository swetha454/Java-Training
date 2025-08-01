import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char op=sc.next().charAt(0);
        if(Character.isDigit(op)){
            System.out.println("NUMBER");
        }
        else if((op>='a' && op<='z') ||( op>='A' && op<='Z')){
            System.out.println("ALPHABET");
        }
        else{
            System.out.println("SPECIAL CHARACTER");
        }
    }
}
