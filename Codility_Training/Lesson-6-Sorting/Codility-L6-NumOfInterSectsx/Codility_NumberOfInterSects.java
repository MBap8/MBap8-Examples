class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] A){
				long[] lower = new long[A.length];
				long[] upper = new long[A.length];
		
				for(int i=0; i<A.length; i++){
					lower[i] = i - (long)A[i];
					upper[i] = i + (long)A[i];
				}
		

				Arrays.sort(upper);
				Arrays.sort(lower);
		
				int intersection = 0;
				int j=0;
		

				for(int i=0; i<A.length; i++){
					while( j < A.length && upper[i] >= lower[j]){
							intersection = intersection + j;
							intersection = intersection - i;
							j++;
					}
				}
		
				if(intersection > 10000000){
					 return -1;
				}
					
		
				return intersection;
	}
}

//O(N*log(N)) or O(N) 