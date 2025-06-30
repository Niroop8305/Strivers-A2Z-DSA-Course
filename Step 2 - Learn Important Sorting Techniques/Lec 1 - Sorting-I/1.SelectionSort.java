import java.util.Scanner;

class SelectionSort {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            int pos=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[pos])
                    pos=j;
            }
            if(pos!=i){
                int temp = arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectionSort ob = new SelectionSort();
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ob.selectionSort(arr);
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
