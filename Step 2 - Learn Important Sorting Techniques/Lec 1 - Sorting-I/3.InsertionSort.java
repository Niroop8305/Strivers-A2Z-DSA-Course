import java.util.Scanner;

class InsertionSort {
    
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i],j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
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
        
        InsertionSort ob = new InsertionSort();
        ob.insertionSort(arr);
        
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
