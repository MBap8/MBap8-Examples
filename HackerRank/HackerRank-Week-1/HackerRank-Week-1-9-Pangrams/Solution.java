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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    HashSet<Character> store = new HashSet<>();
    for (int i = 0; i < s.length(); i++){
        if (!store.contains(Character.toLowerCase(s.charAt(i))) && s.charAt(i) != ' '){
            store.add(Character.toLowerCase(s.charAt(i)));
        }
    }
        
        if (store.size() != 26){
            return "not pangram";
        } else {
            return "pangram";
        }
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = "/Users/markbaptista/Documents/GitHub/Leetcode-Examples/HackerRank-Week-1/HackerRank-Week-1-9-Pangrams/output.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
