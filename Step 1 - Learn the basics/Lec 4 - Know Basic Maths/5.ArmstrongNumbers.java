import java.util.*;
class ArmstrongNumbers {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0,temp=n;
        while(temp>0){
            int rem=temp%10;
            sum+=(rem*rem*rem);
            temp/=10;
        }
        if(sum==n){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int n = sc.nextInt();
        boolean res = ArmstrongNumbers.armstrongNumber(n);
        if(res){
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
        sc.close();
    }
}
