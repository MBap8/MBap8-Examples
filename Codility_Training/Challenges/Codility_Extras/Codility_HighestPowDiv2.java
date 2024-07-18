

def solution(N):
	# Implement your solution here
	highest = 0
	for i in range(0,N):
		output = pow(2,i)
		if (N%output==0):
			highest=i
		if output*2>N:
			break
	return(highest)
	
	
	
public class SolutionConverter {
	public static int solution(int N) {
		int highest = 0;
		for (int i = 0; i < N; i++) {
			int output = (int) Math.pow(2, i);
			if (N % output == 0) {
				highest = i;
			}
			if (output * 2 > N) {
				break;
			}
		}
		return highest;
	}
	
	public static void main(String[] args) {
		int result = solution(15); // Example usage with N = 15
		System.out.println("Highest power of 2 that divides N: " + result);
	}
}
