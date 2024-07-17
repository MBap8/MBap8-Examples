import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinDeletionsForUniqueFrequencies {

    public static int minDeletions(int[] arr) {
        // Step 1: Count frequencies of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a set to keep track of seen frequencies
        Set<Integer> seenFrequencies = new HashSet<>();
        int deletions = 0;

        // Step 3: Iterate over frequency map and ensure unique frequencies
        for (int freq : frequencyMap.values()) {
            // While the frequency is not unique, decrement it
            while (freq > 0 && !seenFrequencies.add(freq)) {
                freq--;  // Reduce frequency to make it unique
                deletions++;  // Increment deletions count
            }
        }

        return deletions;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 3, 4, 1, 2, 4};
        System.out.println(minDeletions(arr)); // Output: 3
    }
}
