class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int currMax=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i], currMax+nums[i]);
            max=Math.max(max, currMax);
        }
        return max;
    }
    public static void main(String[] args) {
        MaxSubArray solution = new MaxSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
