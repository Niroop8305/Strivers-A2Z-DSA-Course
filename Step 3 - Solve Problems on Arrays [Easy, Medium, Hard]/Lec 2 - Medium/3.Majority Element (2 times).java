import java.util.*;
class MajorityElement2times {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        MajorityElement2times solution = new MajorityElement2times();
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }
}
