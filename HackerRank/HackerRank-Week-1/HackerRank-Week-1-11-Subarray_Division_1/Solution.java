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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    int windowSize = 0;
    int amount = 0;
    for (int i = 0; i < m; i++){
        windowSize += s.get(i);
    }
        
        if (windowSize == d){
            amount++;
        }
        
        
    for (int i = m; i < s.size(); i++) {
        windowSize += s.get(i) - s.get(i - m);
        if (windowSize == d){
            amount++;
        }
    }
        
        
        
        
        return amount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = "/Users/markbaptista/Documents/GitHub/Leetcode-Examples/HackerRank-Week-1/HackerRank-Week-1-11-Subarray_Division_1/output.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 