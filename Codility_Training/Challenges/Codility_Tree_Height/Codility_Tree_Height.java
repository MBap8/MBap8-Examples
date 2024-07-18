class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(Tree T) {
		if (T==null)
			return -1;
		return 1+Math.max(solution(T.l), solution(T.r));
	}
}

public int maxDepth(TreeNode root) {
	if (root == null){
		return 0;
	}
	return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}