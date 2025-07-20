import java.util.*;

class NumberAppearsOnce {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        NumberAppearsOnce solution = new NumberAppearsOnce();
        int[] nums = {4, 1, 2, 1, 2};
        int result = solution.singleNumber(nums);
        System.out.println("The number that appears once is: " + result);
    }
}
