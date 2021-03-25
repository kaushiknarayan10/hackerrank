import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {

        int row = 0, col = 0;
        int pd = 0, sd = 0;
        for(int i=0; i<a.length; i++){
            pd = pd + a[row][col];
            row = row + 1;
            col = col + 1;
        }
         row = 0;
        for(int i=a.length-1; i>=0; i--){
            sd = sd + a[row][i];
            row = row + 1;
        }
        
        if(pd>sd) return pd-sd;
        else return sd-pd;
        
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
