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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            sb.append(shiftCharacter(s.charAt(i), k));
        }
        
        return sb.toString();
    }
    
    public static char shiftCharacter(char ch, int shift) {
            int alphabetSize = 26;
            if (Character.isLowerCase(ch)) {
                return (char) ((ch - 'a' + shift) % alphabetSize + 'a');
            } else if (Character.isUpperCase(ch)) {
                return (char) ((ch - 'A' + shift) % alphabetSize + 'A');
            } else {
                return ch;
            }
        }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = "/Users/markbaptista/Documents/GitHub/Leetcode-Examples/HackerRank/HackerRank-Week-2/HackerRank-Week-2-5-Caesar-Cipher/output.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
