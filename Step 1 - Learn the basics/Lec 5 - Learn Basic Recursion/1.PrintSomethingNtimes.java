import java.util.Scanner;

class PrintSomethingNtimes  {
    static void printHello(int n) {
        if(n>0){
            System.out.println("Hello, World!");
            printHello(n-1);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        PrintSomethingNtimes.printHello(n);

        sc.close();
    }
}
