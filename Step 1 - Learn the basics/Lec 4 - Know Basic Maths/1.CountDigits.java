import java.util.Scanner;
class CountDigits {
    static int countDigits(int n) {
        // code here
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=CountDigits.countDigits(n);
        System.out.println(res);
        sc.close();
    }
}
