import java.util.Scanner;

class ReverseAnArray {
    
    static void reverseArray(int arr[],int start,int end){
        if(start>=end)
            return;
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        reverseArray(arr, ++start, --end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ReverseAnArray.reverseArray(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
