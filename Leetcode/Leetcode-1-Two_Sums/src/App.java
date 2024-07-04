public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] sol = {1,3,4,5,7,8}; 
        int[] result = solution.twoSum(sol,9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer target1 = null;
        Integer target2 = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int check = nums[i] + nums[j];
                    if (check == target){
                        target1 = i;
                        target2 = j;
                        break;
                    }
                }
            }
        }
        int[] result = {target1,target2};

        return result;
    }
}