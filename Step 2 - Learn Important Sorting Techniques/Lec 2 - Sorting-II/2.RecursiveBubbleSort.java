import java.util.*;
class RecursiveBubbleSort {
    static void bubbleSort(int arr[], int c, int n){
        if(c>=n){
            return;
        }
        if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        bubbleSort(arr, ++c, n);
    }

    static void bubbleSortRecursive(int[] arr, int n){
        if(n<=1){
            return;
        }

        bubbleSort(arr, 0, n);

        bubbleSortRecursive(arr, --n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        RecursiveBubbleSort.bubbleSortRecursive(arr, arr.length-1);
        
        System.out.print("Sorted array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        sc.close();
    }
}
