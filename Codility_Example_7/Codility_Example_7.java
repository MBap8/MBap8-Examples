class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String sam = "XXYYYYYYY";
		String[] exp = sol.splitSame(sam);
	}
}
class Solution {
	public String[] splitSame(String s1){
		int leftX = 0;
		int rightY = 0;
		int rightX = 0;
		int leftY = 0;
		int startIndex = 0;
		int endIndex = s1.length() - 1;
		while (startIndex < endIndex){
			if (startIndex > endIndex){
				break;
			}
			if (s1.charAt(startIndex) == 'X'){
				leftX++;
			} else {
				leftY++;
			}
			if (s1.charAt(endIndex) == 'Y'){
				rightY++;
			} else {
				rightX++;
			}
			
			startIndex++;
			endIndex--;
		}
		
		
		String[] res = {"X","Y"};
		return res;
	}
}