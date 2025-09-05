import java.util.HashMap;
class CountSubarraysWithGivenSum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        
        sumMap.put(0, 1);
        
        for (int num : nums) {
            currentSum += num;
            
            if (sumMap.containsKey(currentSum - k)) {
                count += sumMap.get(currentSum - k);
            }
            
            sumMap.put(currentSum, sumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        CountSubarraysWithGivenSum cs = new CountSubarraysWithGivenSum();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 9;
        System.out.println(cs.subarraySum(nums, k));
    }
}
