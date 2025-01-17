import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int pairCount = 0;
        for(int i=0; i<n; i++){
            if(!countMap.containsKey(ar[i])){
                countMap.put(ar[i],1);
            }
            else {
                countMap.put(ar[i],countMap.get(ar[i])+1);
                if(countMap.get(ar[i]) % 2 == 0)    pairCount++;  
            }
        }
        
        return pairCount;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
