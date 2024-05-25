import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String a = "5678";
		List<String> aa = new ArrayList<String>(sol.letterCombinations(a));
		System.out.println(aa);
	}
}

class Solution {
	public List<String> letterCombinations(String digits) {
		List<String> sol = new ArrayList<String>();
		HashMap<Character, char[]> ref = new HashMap<Character, char[]>();
		ref.put('2', new char[] {'a','b','c'});
		ref.put('3', new char[] {'d','e','f'});
		ref.put('4', new char[] {'g','h','i'});
		ref.put('5', new char[] {'j','k','l'});
		ref.put('6', new char[] {'m','n','o'});
		ref.put('7', new char[] {'p','q','r','s'});
		ref.put('8', new char[] {'t','u','v'});
		ref.put('9', new char[] {'w','x','y','z'});
		char[] chara = digits.toCharArray();
		if (chara.length == 1){
			if (chara[0]==' '){
				sol.add("\"\"");
				return sol;
			} else {
			char[] result = ref.get(chara[0]);
			for (Character c : result){
				sol.add(c.toString());
			}
			return sol;
		}} else if (chara.length == 2){
			char[] result1 = ref.get(chara[0]);
			char[] result2 = ref.get(chara[1]);
			for (int i = 0; i < result1.length; i++) {
				String a = String.valueOf(result1[i]);
				for (int j = 0; j < result2.length; j++) {
					String b = String.valueOf(result2[j]);
					sol.add(a+b);
				}
			}
			return sol;
		} else if (chara.length == 3){
			char[] result1 = ref.get(chara[0]);
			char[] result2 = ref.get(chara[1]);
			char[] result3 = ref.get(chara[2]);
			for (int i = 0; i < result1.length; i++) {
				String a = String.valueOf(result1[i]);
				for (int j = 0; j < result2.length; j++) {
					String b = String.valueOf(result2[j]);
					for (int k = 0; k < result3.length; k++) {
						String c = String.valueOf(result3[k]);
						sol.add(a+b+c);
					}
				}
			}
			return sol;
		} else if (chara.length == 4){
			char[] result1 = ref.get(chara[0]);
			char[] result2 = ref.get(chara[1]);
			char[] result3 = ref.get(chara[2]);
			char[] result4 = ref.get(chara[3]);
			for (int i = 0; i < result1.length; i++) {
				String a = String.valueOf(result1[i]);
				for (int j = 0; j < result2.length; j++) {
					String b = String.valueOf(result2[j]);
					for (int k = 0; k < result3.length; k++) {
						String c = String.valueOf(result3[k]);
						for (int l = 0; l < result4.length; l++) {
							String d = String.valueOf(result4[l]);
							sol.add(a+b+c+d);
						}
					}
				}
			}
			return sol;
		} else {
			sol.add("\"\"");
			return sol;
		}
	}
}