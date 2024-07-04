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



public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(Arrays.asList(11, 2, 4));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(10, 8, -12));
        int result = Result.diagonalDifference(arr);
        System.out.println(result);
    }
}

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int firstDiagIndex = 0;
    int lastDiagIndex = arr.size() - 1;
    int frontDiagVal = 0;
    int backDiagVal = 0;
    
    for (int i = 0; i < arr.size(); i++){
        frontDiagVal += arr.get(i).get(firstDiagIndex);
        backDiagVal += arr.get(i).get(lastDiagIndex);
        firstDiagIndex++;
        lastDiagIndex--;
    }
    
    
    return Math.abs(frontDiagVal - backDiagVal);
    }

}


