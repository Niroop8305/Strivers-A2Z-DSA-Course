import java.util.*;

class TwoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(currentNum, i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        TwoSumProblem solution = new TwoSumProblem();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to " + target + ": " + Arrays.toString(result));
    }
}
