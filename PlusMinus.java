import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        int plus=0,minus=0,zero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0) plus++;
            else if(arr[i] < 0) minus++;
            else zero++;
        }

        int len = arr.length;        
        
        float totalplus =  ((float)plus / (float)len);
        float totalminus = ((float)minus / (float)arr.length);
        float totalzero = ((float) zero / (float)arr.length);        
        
        System.out.println(totalplus);
        System.out.println(totalminus);
        System.out.println(totalzero);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
