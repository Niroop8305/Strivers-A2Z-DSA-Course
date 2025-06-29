import java.util.Scanner;

class FactorialofNnumbers {
    static int factorial(int n) {
        // code here
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(--n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int i=sc.nextInt();
        int fact=FactorialofNnumbers.factorial(i);
        System.out.println(fact);

        sc.close();
    }
}
