class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String sam = "xyyyx";
//		String[] exp = sol.splitSame(sam);
		int res = sol.findSplitIndex(sam);
		System.out.println(res);
	}
}
class Solution {
	public int findSplitIndex(String s1){
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
			if (s1.charAt(startIndex) == 'x'){
				leftX++;
			} else {
				leftY++;
			}
			if (s1.charAt(endIndex) == 'y'){
				rightY++;
			} else {
				rightX++;
			}
			
			startIndex++;
			endIndex--;
		}
		int splitIndex = 0;
		int requiredSplit = 0;
		int reqCount = 0;
		if (leftX > rightY){
			requiredSplit = rightY;
		} else if (rightY >= leftX){
			requiredSplit = leftX;
		}
		
		if (leftX == rightX && leftY == rightY){
			return -1;
		}
		
		int index = 0;
		while (requiredSplit != reqCount){
			if (s1.charAt(splitIndex) == 'x'){
				reqCount++;
			}
			splitIndex++;
		}
		
		return splitIndex;
	}
}