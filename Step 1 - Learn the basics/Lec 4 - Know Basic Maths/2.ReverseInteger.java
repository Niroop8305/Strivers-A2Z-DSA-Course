import java.util.Scanner;
class ReverseInteger {
    static int reverse(int x) {
        int rev=0;
        if (x==0)
            return rev;
        while(x!=0){
            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            int rem=x%10;
            x/=10;
            rev=rev*10+rem;
        }
        return rev;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=ReverseInteger.reverse(n);
        System.out.println(res);
        sc.close();
    }
}
