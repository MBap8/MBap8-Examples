class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.intToRoman(3601));
	}
}

class Solution {
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		while (num != 0){
			sb = convert(num, sb);
			num = deduct(num);
		}
		
		return sb.toString();
	}
	
	public StringBuilder convert(int num, StringBuilder sb){
		
		if (num >= 1000){
			return sb.append('M');
		}else if (num >= 900){
			return sb.append("CM");
		} else if (num >= 500){
			return sb.append('D');
		} else if (num >= 400){
			return sb.append("CD");
		}
		else if (num >= 100){
			return sb.append('C');
		} else if (num >= 90){
			return sb.append("XC");
		}
		else if (num >= 50){
			return sb.append('L');
		} else if (num >= 40){
			return sb.append("XL");
		} 
		else if (num >= 10){
			return sb.append('X');
		}else if (num >= 9){
			return sb.append("IX");
		}
		else if (num >= 5){
			return sb.append('V');
		} else if (num >= 4){
			return sb.append("IV");
		}
		else if (num >= 1){
			return sb.append('I');
		}  
		return sb;
	}
	public int deduct(int num){
		
		if (num >= 1000){
			return num - 1000;
		}else if (num >= 900){
			return num - 900;
		} else if (num >= 500){
			return num - 500;
		} else if (num >= 400){
			return num - 400;
		}
		else if (num >= 100){
			return num - 100;
		} else if (num >= 90){
			return num - 90;
		}
		else if (num >= 50){
			return num - 50;
		} else if (num >= 40){
			return num - 40;
		} 
		else if (num >= 10){
			return num - 10;
		}else if (num >= 9){
			return num - 9;
		}
		else if (num >= 5){
			return num - 5;
		} else if (num >= 4){
			return num - 4;
		}
		else if (num >= 1){
			return num - 1;
		}  
		return num;
	}
}

// passed o(1)