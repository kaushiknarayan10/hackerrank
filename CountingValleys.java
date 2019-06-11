import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        boolean seaLevel = true;
        boolean up = false;
        boolean down = false;
        int totalCount = 0;
        int result = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'U')  totalCount++;
            if(s.charAt(i) == 'D')  totalCount--;
            if (totalCount == 0)    seaLevel = true;
            if (seaLevel && totalCount < 0)     down = true;
            if (seaLevel && down && totalCount == 0) {
                result++;
                seaLevel = true;
                up = false;
                down = false;
            }
        }
        
        return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
