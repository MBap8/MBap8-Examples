class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] numbers){
		int pairs = 0;
		for (int i = 0; i < numbers.length; i++){
			String currNum = String.valueOf(numbers[i]);
			char lastDigit = currNum.charAt(currNum.length() - 1);
			for (int j = 0; j < numbers.length; j++){
				if (j != i){
					char firstDigit = String.valueOf(numbers[j]).charAt(0);
					if (lastDigit == firstDigit){
						pairs++;
					}
				}
			}
		}
		return pairs;
	}
}

public class DigitPairs {
	public static int solution(int[] numbers) {
		// Maps to store the counts of first and last digits
		HashMap<Integer, Integer> lastDigitCounts = new HashMap<>();
		HashMap<Integer, Integer> firstDigitCounts = new HashMap<>();
		
		// Populate the hash maps
		for (int num : numbers) {
			int lastDigit = num % 10;
			int firstDigit = getFirstDigit(num);
			
			lastDigitCounts.put(lastDigit, lastDigitCounts.getOrDefault(lastDigit, 0) + 1);
			firstDigitCounts.put(firstDigit, firstDigitCounts.getOrDefault(firstDigit, 0) + 1);
		}
		
		// Calculate the number of valid pairs
		int pairs = 0;
		for (int digit = 0; digit <= 9; digit++) {
			if (lastDigitCounts.containsKey(digit) && firstDigitCounts.containsKey(digit)) {
				pairs += lastDigitCounts.get(digit) * firstDigitCounts.get(digit);
			}
		}
		
		return pairs;
	}
	
	// Helper method to get the first digit of a number
	private static int getFirstDigit(int num) {
		while (num >= 10) {
			num /= 10;
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] numbers = {23, 34, 45, 56, 67, 78, 89, 90, 12};
		System.out.println("Number of pairs: " + solution(numbers)); // Output the number of pairs
	}
}