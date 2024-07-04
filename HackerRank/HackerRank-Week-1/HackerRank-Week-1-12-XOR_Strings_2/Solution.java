import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        scanner.close();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < firstString.length(); i++) {
            int one = Character.getNumericValue(firstString.charAt(i));
            int two = Character.getNumericValue(secondString.charAt(i));
            if (one + two == 1){
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        System.out.println(sb.toString());
    }
}