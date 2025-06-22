import java.util.Scanner;
class CheckPalindrome {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        } else if( x == 0){
            return true;
        } else {
            int rev=CheckPalindrome.revInt(x);
            if(x==rev){
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static int revInt(int x){
        int rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=CheckPalindrome.isPalindrome(n);
        System.out.println(res);
        sc.close();
    }
}
