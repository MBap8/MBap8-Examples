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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public int lonelyinteger(List<Integer> a) {    
    HashSet<Integer> contains = new HashSet<>();
    HashSet<Integer> multiContains = new HashSet<>();
    
    for (int i = 0; i < a.size(); i++){
        if (!multiContains.contains(a.get(i))){
            if (!contains.contains(a.get(i))){
                contains.add(a.get(i));
            } else {
                contains.remove(a.get(i));
                multiContains.add(a.get(i));
            }
        }
    }
        
     Integer res[] = contains.toArray(new Integer[1]);
    
    
    return res[0];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//      int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//      List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//          .map(Integer::parseInt)
//          .collect(toList());
//
//      int result = Result.lonelyinteger(a);
//
//      bufferedWriter.write(String.valueOf(result));
//      bufferedWriter.newLine();
//
//      bufferedReader.close();
//      bufferedWriter.close();
        Result res = new Result();
        List<Integer> test = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,1));
        
}
}
