import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x2>x1 && v2>v1)  return "NO";
        boolean noMatch = true;
        String result = "NO";
        int k1jump = 0;
        int k2jump = 0;
        int k1dist = x1;
        int k2dist = x2;
        boolean change = true;
        if(k1dist<k2dist)    change = true;
        else    change = false;
        
        while(noMatch){
            
            k1dist = k1dist + v1;
            k2dist = k2dist + v2;
            k1jump++;
            k2jump++;
            if(k1jump == k2jump && k1dist == k2dist){
                noMatch = false;
                result = "YES";
                break;
            }
            if(change) {
                if(k1dist > k2dist) {
                    result = "NO";
                    break;
                }
            }
            else {
                if(k2dist > k1dist) {
                    result = "NO";
                    break;
                }
            }    
        }
        
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
