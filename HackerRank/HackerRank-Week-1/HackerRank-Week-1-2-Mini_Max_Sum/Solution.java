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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    double minVal = arr.get(0);
    double maxVal = arr.get(0);
    double total = 0;
    
    for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i));
        minVal = Math.min(minVal, arr.get(i));
        maxVal = Math.max(maxVal, arr.get(i));
        total = total + arr.get(i);
    }
        double totalMin = total - maxVal;
        double totalMax = total - minVal;
        
        System.out.printf("%.0f %.0f",totalMin, totalMax);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
