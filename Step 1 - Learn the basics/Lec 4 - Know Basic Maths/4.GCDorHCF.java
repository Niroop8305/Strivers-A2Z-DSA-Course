import java.util.Scanner;
class GCDorHCF {
    public static int gcd(int a, int b) {
        // code here
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int res=GCDorHCF.gcd(n,m);
        System.out.println(res);
        sc.close();
    }
}
