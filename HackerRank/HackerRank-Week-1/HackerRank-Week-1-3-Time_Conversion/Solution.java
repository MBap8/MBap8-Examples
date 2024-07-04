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
import javax.xml.transform.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    StringBuilder res = new StringBuilder();
    
    String timeOfDay = s.substring(s.length() - 2);
    
    boolean timeOfDayBool = timeOfDay.equals("AM") ? true : false;
    
    String time = s.substring(0, s.length() - 2);
    String[] timeSplit = time.split(":");
    
    if (timeOfDayBool){
        if (Integer.parseInt(timeSplit[0]) == 12){
            res.append("00");
            res.append(":");
        } else {
            res.append(timeSplit[0]);
            res.append(":");
        }
        res.append(timeSplit[1]);
        res.append(":");
        res.append(timeSplit[2]);
    } else {
        int oldTime = Integer.parseInt(timeSplit[0]);
        int newTime = oldTime;
        if (oldTime != 12){
            newTime = oldTime + 12;
            res.append(newTime);
            res.append(":");
        } else {
            res.append(newTime);
            res.append(":");
        }
        res.append(timeSplit[1]);
        res.append(":");
        res.append(timeSplit[2]);
    }
    
    
    return res.toString();
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