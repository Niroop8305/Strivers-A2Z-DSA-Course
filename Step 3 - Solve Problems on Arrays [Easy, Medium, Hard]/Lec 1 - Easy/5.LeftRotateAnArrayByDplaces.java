class LeftRotateAnArrayByDplaces {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        if (n == 0 || k == 0) {
            return;
        }

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        LeftRotateAnArrayByDplaces solution = new LeftRotateAnArrayByDplaces();
        int[] nums = {1, 2, 3, 4, 5};
        int d = 2;
        solution.rotate(nums, d);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
