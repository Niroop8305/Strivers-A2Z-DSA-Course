import java.util.Scanner;

class MergeSort {
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r){
        int i=l,j=m+1,k=0;
        int temp[] = new int[r-l+1];
        while(i<=m && j<=r){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            } else {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=m){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]=arr[j];
            j++;
            k++;
        }
        i=l;
        for(int a=0;a<k && i<=r ;a++){
            arr[i]=temp[a];
            i++;
        }
    }

    // Optimized merge function

    // void merge(int arr[], int l, int m, int r){
    //     // Size of the merged subarray
    //     int n1 = m - l + 1;
    //     int n2 = r - m;
    
    //     // Create temporary arrays
    //     int L[] = new int[n1];
    //     int R[] = new int[n2];
    
    //     // Copy data to temporary arrays L[] and R[]
    //     for (int i = 0; i < n1; i++)
    //         L[i] = arr[l + i];
    //     for (int j = 0; j < n2; j++)
    //         R[j] = arr[m + 1 + j];
    
    //     // Merge the temporary arrays back into arr[l..r]
    
    //     int i = 0, j = 0; // Initial indexes of first and second subarrays
    
    //     int k = l; // Initial index of merged subarray
    //     while (i < n1 && j < n2) {
    //         if (L[i] <= R[j]) {
    //             arr[k] = L[i];
    //             i++;
    //         } else {
    //             arr[k] = R[j];
    //             j++;
    //         }
    //         k++;
    //     }
    
    //     // Copy the remaining elements of L[], if any
    //     while (i < n1) {
    //         arr[k] = L[i];
    //         i++;
    //         k++;
    //     }
    
    //     // Copy the remaining elements of R[], if any
    //     while (j < n2) {
    //         arr[k] = R[j];
    //         j++;
    //         k++;
    //     }
    // }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, n-1);
        
        System.out.print("Sorted array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        sc.close();
    }
}
