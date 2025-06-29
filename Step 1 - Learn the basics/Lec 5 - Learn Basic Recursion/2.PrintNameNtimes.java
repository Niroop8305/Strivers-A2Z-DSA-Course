import java.util.*;
class PrintNameNtimes {

    static void printName(String name,int n){
        while(n>0){
            System.out.println(name);
            n--;
            printName(name, n);
            return;
        }
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.err.print("Enter no.of times name to br printed:");
        int n = sc.nextInt();
        PrintNameNtimes.printName(name, n);

        sc.close();
    }
}
