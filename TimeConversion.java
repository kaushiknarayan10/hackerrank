import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String result = "";
        String conv = s.substring(s.length()-2);
        if(conv.equalsIgnoreCase("PM")) {
            if(hour == 12)    hour = 12;
            else    hour = hour + 12;
            result = String.valueOf(hour);
        }
        else {
            if(hour == 12)    result = "00";
            else    result = s.substring(0, 2);
        }
        
        result = result + s.substring(2, s.length()-2);
        
        return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
