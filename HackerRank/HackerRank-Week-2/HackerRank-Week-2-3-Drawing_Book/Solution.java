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
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    if (p == 1 || p == n || p + 1 == n){
        return 0;
    }
    if (p % 2 == 0){
        return p/2;
    } else {
        return (p - 1)/2;
    }
    }
    
    public static int pageCountTwo(int n, int p){
        if (p % 2 != 0){
            p=p-1;
        }
        int front = p/2;
        int back = (n-p)/2;
        
        return Math.min(front, back);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = "/Users/markbaptista/Documents/GitHub/Leetcode-Examples/HackerRank-Week-2/HackerRank-Week-2-3-Drawing_Book/output.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
