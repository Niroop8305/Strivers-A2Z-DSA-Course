class MaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            } else {
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumConsecutiveOnes solution = new MaximumConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxCount = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + maxCount);
    }
}
