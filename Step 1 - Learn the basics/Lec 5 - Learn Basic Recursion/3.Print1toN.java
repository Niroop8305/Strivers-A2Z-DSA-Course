import java.util.*;
class Print1toN {
    static int i=1;
    static void prinNumber(int n){
        while(Print1toN.i<=n){
            System.out.println(Print1toN.i);
            Print1toN.i++;
            Print1toN.prinNumber(n);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Print1toN.prinNumber(n);
        sc.close();
    }
}
