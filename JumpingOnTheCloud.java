import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int index = 0;
        
        while(index < c.length) {
            if(c[index]!=1) {
                if(index+2 < c.length) {
                    if(c[index+2]==0) {
                        jumps++;
                        index = index + 2;
                    } else if(c[index+1]==0) {
                        jumps++;
                        index++;
                    }
                    
                }else if(index+1 < c.length) {
                    if(c[index+1]==0) {
                        jumps++;
                        index++;
                    } else    index++;
                    
                }
                else index++;
            }
            else    index++;
        }

        return jumps;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
