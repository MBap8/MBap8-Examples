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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    float amountPos = 0;
    float amountNeg = 0;
    float amountZero = 0;
    float arraySize = arr.size();
    
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) > 0){
            amountPos++;
        } else if (arr.get(i) < 0){
            amountNeg++;
        } else {
            amountZero++;
        }
    }
        
        System.out.printf("%.6f\n",amountPos/arraySize);
        System.out.printf("%.6f",amountNeg/arraySize);
        System.out.printf("%.6f",amountZero/arraySize);
        

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}