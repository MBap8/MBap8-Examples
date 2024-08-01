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
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
    boolean player = true;
    while (n != 1){
        if (isPowerOfTwo(n)){
            n = n/2;
        } else {
            long count = n;
            while (!isPowerOfTwo(count)){
                count--;
            }
            n = n - count;
        }
        if (n == 1){
            break;
        }
        player ^= true;
    }
        if (player){
            return "Louise";
        } else {
            return "Richard";
        }
    }
    public static boolean isPowerOfTwo(long n)
    {
        return (Math.ceil((Math.log(n) / Math.log(2)))) 
            == (Math.floor(((Math.log(n) / Math.log(2)))));
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = "/Users/markbaptista/Documents/GitHub/Leetcode-Examples/HackerRank/HackerRank-Week-2/HackerRank-Week-2-Counter-Game/output.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
        

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                String result = Result.counterGame(n);

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


// correct answer but too long
public static String counterGame(long n) {
    int move = 0;
    if (n==1) return "Louise";
    while (n > 1) {
        // Using base change formula: logb(a) = log(a) / log(b)
        if ((Math.log(n)/Math.log(2)) % 1 == 0){
            n /= 2;
        }
        else n -= Math.pow(2, (int)(Math.log(n)/Math.log(2)));
        move++;
    }
    if (move % 2 == 0) return "Richard";
    return "Louise";
}