import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        for(int i=n-1; i>=0; i--){
            printspaces(i);
            printsymbol(n-i);
            System.out.println();
        }
    }
    
    static void printspaces(int i){
        for(int j=0; j<i; j++) System.out.print(" ");
    }
    
    static void printsymbol(int k){
        for(int j=0; j<k; j++) System.out.print("#");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
