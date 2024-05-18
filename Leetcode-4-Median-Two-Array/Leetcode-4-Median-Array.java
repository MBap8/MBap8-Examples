import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] a1 = {1,2};
		int[] a2 = {3};
		double med = sol.findMedianSortedArrays(a1, a2);
		System.out.println(med);
	}
}

class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] comb = Arrays.copyOf(nums1, nums1.length + nums2.length);
		System.arraycopy(nums2, 0, comb, nums1.length, nums2.length);
		Arrays.sort(comb);
		System.out.println(comb.length);
		if (comb.length % 2 == 0){
			int midp = (comb.length)/2;
			int midp2 = midp + 1;
			double combCor = comb[midp-1] + comb[midp2-1];
			double newRes = (combCor)/2.0;
			return newRes;
		} else {
			double mid = (comb.length)/2.0;
			double midcalc = Math.round(mid);
			double corVal = comb[(int)midcalc-1];
			return corVal;
		}
	}
}