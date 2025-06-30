import java.util.Scanner;

class RecursiveInsertionSort {

    static int insertionSort(int arr[], int ele, int index){
        if(index>=0 && arr[index]>ele){
            arr[index+1]=arr[index];
            index = insertionSort(arr, ele, --index);
        }
        return index;
    }

    static void insertionSortRecursive(int arr[], int i, int n){
        if(n<=1){
            return;
        }
        int temp=arr[i];
        int j = insertionSort(arr, temp, i-1);
        arr[j+1]=temp;
        
        if(i+1<n){
            insertionSortRecursive(arr, ++i, n);
        }
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
        RecursiveInsertionSort.insertionSortRecursive(arr, 1 ,arr.length);
        
        System.out.print("Sorted array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        sc.close();
    }
}
