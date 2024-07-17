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
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        
//      for (int i = 1; i < arr.size() - 1; i++){
//          int begSum1 = 0;
//          int begSum2 = 0;
//          for (int j = 0; j < i; j++){
//              begSum1 += arr.get(j);
//          }
//          
//          for (int k = arr.size() - 1; k > i; k--){
//              begSum2 += arr.get(k);
//          }
//          
//          if (begSum1 == begSum2){
//              return "YES";
//          }
//          
//      }
//      return "NO";
        
        int windowLeft  = 0;
        int windowRight = 0;
        for (int i = 1; i < arr.size(); i++){
            windowRight += arr.get(i);
        }
        
        if (windowRight == windowLeft){
            return "YES";
        }
        
        
        for (int i = 1; i < arr.size(); i++){
            windowLeft += arr.get(i - 1);
            windowRight -= arr.get(i);
            
            if (windowRight == windowLeft){
                return "YES";
            }
        }
        




        return "NO";
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = "/Users/markbaptista/Documents/GitHub/Leetcode-Examples/HackerRank/HackerRank-Week-2/HackerRank-Week-2-10-Sherlock/output.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
