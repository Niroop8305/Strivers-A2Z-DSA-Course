class Sortanarrayof01and2 {
    public void sortColors(int[] nums) {
        java.util.Arrays.sort(nums);
    }
    public static void main(String[] args) {
        Sortanarrayof01and2 solution = new Sortanarrayof01and2();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        System.out.println("Sorted array: " + java.util.Arrays.toString(nums));
    } 
}
