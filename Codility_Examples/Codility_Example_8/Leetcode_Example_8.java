class Untitled {
	public static void main(String[] args) {
		int k = 100;
		int[] input = {12,3434,16,16,232,321,23,982321};
		int columns = 0;
		int rows = 3;
		
		int maxDigit = Untitled.getMaxDigitCount(input);
		
		int lastRow = 0;
		
		if (k >= input.length){
			columns = input.length;
			rows = 3;
		} else {
			columns = k;
			int remain = input.length - k;
			lastRow = remain;
			if (k > remain){
				rows+=2;
			} else {
				while (remain > 0){
					lastRow = remain;
					remain = remain - k;
					if (remain == 0){
						lastRow = 0;
					}
					rows+=2;
				}
			}
		}
		
		String[][] finalPrint = new String[rows][columns];
		
		int columnsLength = finalPrint[0].length;
		int arrayCount = 0;
		
		for (int i = 0; i < finalPrint.length; i++){
			boolean even = (i % 2) == 0;
			int last = lastRow;
			for (int j = 0; j < columnsLength; j++) {
				StringBuilder sb = new StringBuilder();
				if (even){
					if ((i == finalPrint.length - 1) && lastRow > 0){
						if (last > 0){
							sb.append("|");
							String dash = "-";
							sb.append(dash.repeat(maxDigit));
							finalPrint[i][j] = sb.toString();
							last--;
						} else if (last == 0) {
							sb.append("|");
							last--;
							finalPrint[i][j] = sb.toString();
						} else {
							sb.append("");
							finalPrint[i][j] = sb.toString();
						}
					} else if (j == columnsLength - 1){
						sb.append("|");
						String dash = "-";
						sb.append(dash.repeat(maxDigit));
						sb.append("|");
						finalPrint[i][j] = sb.toString();
					} else {
						sb.append("|");
						String dash = "-";
						sb.append(dash.repeat(maxDigit));
						finalPrint[i][j] = sb.toString();
					}
				} else if (arrayCount < input.length) {
					if (i == finalPrint.length - 2 && lastRow > 0){
						if (arrayCount < input.length){
							last--;
							sb.append("|");
							int digit = getDigitCount(input[arrayCount]);
							if (digit < maxDigit){
								String space = " ";
								sb.append(space.repeat(maxDigit - digit));
								sb.append(input[arrayCount]);
							} else {
								sb.append(input[arrayCount]);
							}
							if (last <= 0){
								sb.append("|");
							}
							finalPrint[i][j] = sb.toString();
							arrayCount++;
						}
					} else {
						sb.append("|");
						int digit = getDigitCount(input[arrayCount]);
						if (digit < maxDigit){
							String space = " ";
							sb.append(space.repeat(maxDigit - digit));
							sb.append(input[arrayCount]);
						} else {
							sb.append(input[arrayCount]);
						}
						if (j == columnsLength - 1){
							sb.append("|");
						}
						finalPrint[i][j] = sb.toString();
						arrayCount++;
					}
				} else {
					sb.append("");
					finalPrint[i][j] = sb.toString();
				} 

				
			}
		}
		for (String[] row : finalPrint){
			StringBuilder rowString = new StringBuilder();
			for(String col : row){
				rowString.append(col);
			}
			System.out.println(rowString.toString());	
		}
	}
	
	public static int getMaxDigitCount(int[] numbers) {
		int maxDigits = 0;
		
		for (int number : numbers) {
			int digitCount = getDigitCount(Math.abs(number));
			if (digitCount > maxDigits) {
				maxDigits = digitCount;
			}
		}
		
		return maxDigits;
	}
	
	public static int getDigitCount(int number) {
		if (number == 0) {
			return 1;
		}
		
		return (int) Math.log10(number) + 1;
	}
}

