class FindMissingNumberInAnArray{
    public int missingNumber(int[] nums) {
        int arr[] = new int[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        int missing=-1;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                missing=i;
                return missing;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        FindMissingNumberInAnArray solution = new FindMissingNumberInAnArray();
        int[] nums = {3, 0, 1};
        int missing = solution.missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}
