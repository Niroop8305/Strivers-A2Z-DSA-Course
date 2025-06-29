import java.util.Scanner;

class SumoffirstNnumbers {
    
    static int i=1,sum=0;

    static int findSum(int n){
        if(n>0){
            sum+=SumoffirstNnumbers.i;
            SumoffirstNnumbers.i++;
            SumoffirstNnumbers.findSum(--n);
        }
        return SumoffirstNnumbers.sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=SumoffirstNnumbers.findSum(n);
        System.out.println(sum);

        sc.close();
    }
}
