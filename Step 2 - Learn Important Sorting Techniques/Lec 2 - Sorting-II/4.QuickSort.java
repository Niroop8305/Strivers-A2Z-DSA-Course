import java.util.Scanner;
class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low < high){
            int n = partition(arr, low, high);
            quickSort(arr, low, n-1);
            quickSort(arr, n+1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        
        // your code here
        int pivot = arr[low];
        int i=low,j=high;
        while(i<j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){ 
            arr[i] = sc.nextInt();
        }   
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }   
        sc.close();
    }
}
