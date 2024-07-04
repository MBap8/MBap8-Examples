import java.awt.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numt = {1,2,3,0,0,0};
		int[] num4 = {2,5,6};
		int m = 3;
		int n = 3;
		sol.merge(numt, m, num4, n);
		System.out.println(Arrays.toString(numt));
		
	}
}

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int counter = 0;
		int numArrayCount = 0;
		int[] newNum = new int[m+n];
		
		for (int i = 0; i < m+n; i++) {
			if (counter < n){
				if (nums1[numArrayCount] > nums2[counter]){
					newNum[i] = nums2[counter];
					counter++;
				} else if (numArrayCount < m) {
					newNum[i] = nums1[numArrayCount];
					numArrayCount++;
				} else {
					newNum[i] = nums2[counter];
					counter++;
				}
			} else {
				newNum[i] = nums1[numArrayCount];
				numArrayCount++;
			}
	}
	for (int i = 0; i < newNum.length; i ++){
		nums1[i] = newNum[i];
	}
}
}

// Accepted with 0ms runtime and 41.90mb memory