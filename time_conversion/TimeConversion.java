import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String hour = s.substring(0, 2);
        String min = s.substring(3, 5);
        String sec = s.substring(6, 8);
        String post = s.substring(8);
        
        String rtn = "";        
        if (post.equals("AM")) {
            if (hour.equals("12")) {
                hour = "00";
            }
            rtn = hour + ":" + min + ":" + sec;
        } else {
            int h = Integer.parseInt(hour);
            if (!hour.equals("12")) {
                h += 12;                
            }
            rtn = h + ":" + min + ":" + sec;
        }
        
        return rtn;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
