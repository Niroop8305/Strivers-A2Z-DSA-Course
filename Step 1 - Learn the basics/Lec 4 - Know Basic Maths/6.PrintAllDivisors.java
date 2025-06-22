import java.util.Scanner;
class PrintAllDivisors {
    public static void print_divisors(int n) {
        // code here
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its divisors:");
        int n = sc.nextInt();
        PrintAllDivisors.print_divisors(n);
        sc.close();
    }
}
