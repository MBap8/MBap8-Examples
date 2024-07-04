class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		double test = 2.0;
		int pow = -3;
		double res = sol.myPow(test, pow);
		System.out.println(res);
	}
}



class Solution {
	public double myPow(double x, int n) {
		long calcResult = (double)x;
		if (n == 0){
			return 1;
		}
		long posNumber = Math.abs(n);
		calcResult = Math.pow((long)x,posNumber);
		System.out.println(calcResult);
		if (n < 0) {
			calcResult = 1 / calcResult;
		}
		
		return (double)calcResult;
	}
}