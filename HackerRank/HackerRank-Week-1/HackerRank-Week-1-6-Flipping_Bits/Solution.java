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
import javax.xml.transform.*;

public class Solution {
    public static void main(String[] args){
        Result res = new Result();
        System.out.println(res.flippingBits(1));
    }
}


class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public long flippingBits(long n) {
        String binary = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
        
        StringBuilder flippedBinary = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            flippedBinary.append(bit == '0' ? '1' : '0');
        }
        
        return Long.parseUnsignedLong(flippedBinary.toString(), 2);
    }

}

