import java.util.*;
class LongestConsecutiveSequenceInAnArray {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        Arrays.sort(nums);

        int seq=1,temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                temp++;
                if(temp > seq)
                    seq=temp;
            } else if(nums[i] == nums[i-1]){
                continue;
            } else {
                temp=1;
            }
        }
        return seq;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequenceInAnArray obj = new LongestConsecutiveSequenceInAnArray();
        int[] nums = {100,4,200,1,3,2};
        System.out.println(obj.longestConsecutive(nums)); // Output: 4
    }
}
