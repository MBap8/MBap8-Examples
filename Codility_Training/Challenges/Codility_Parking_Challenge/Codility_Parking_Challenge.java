class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("10:00", "13:21"));
	}
}

class Solution {
	public int solution(String E, String L){
		String[] entryArr = E.split(":");
		String[] leaveArr = L.split(":");
		
		int hourDiff = Integer.parseInt(leaveArr[0]) - Integer.parseInt(entryArr[0]);
		if (Integer.parseInt(entryArr[1]) < Integer.parseInt(leaveArr[1])){
			hourDiff++;
		}
		if (hourDiff == 0){
			return 2 + 3;
		}
		int price = 2;
		for (int i = 1; i <= hourDiff; i++){
			if (i == 1){
				price+=3;
			} else {
				price += 4;
			}
		}
		return price;
	}
}

// TwoDigitHour