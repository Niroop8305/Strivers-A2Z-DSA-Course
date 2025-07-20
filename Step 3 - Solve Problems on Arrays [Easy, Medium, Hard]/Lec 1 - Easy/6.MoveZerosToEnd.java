class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int n=nums.length,j=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            nums[i]=arr[i];
        }
        for(int i=j;i<n;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        MoveZerosToEnd solution = new MoveZerosToEnd();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
