import java.util.Scanner;

class SecondLargestElementInAnArray {
    public static int getSecondLargest(int[] arr) {
        // code here
        int max1=-1,max2=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            if(arr[i]<max1 && arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = getSecondLargest(arr);
        System.out.println("Largest element in the array: " + result);
        sc.close();
    }
}
