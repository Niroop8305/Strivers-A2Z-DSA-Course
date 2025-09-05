class RearrangeTheArrayInAlternatingPositiveAndNegativeItems {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0, neg = 1;
        for (int num : nums) {
            if (num > 0) {
                result[pos] = num;
                pos += 2;
            } else {
                result[neg] = num;
                neg += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RearrangeTheArrayInAlternatingPositiveAndNegativeItems obj = new RearrangeTheArrayInAlternatingPositiveAndNegativeItems();
        int[] nums = {3,1,-2,-5,2,-4};
        int[] result = obj.rearrangeArray(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
