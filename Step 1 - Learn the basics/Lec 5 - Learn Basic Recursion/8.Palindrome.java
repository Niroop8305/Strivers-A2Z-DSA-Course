import java.util.Scanner;

class Palindrome {
    static boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        String rev = sb.reverse().toString();
        if(s.equals(rev)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        boolean result = Palindrome.isPalindrome(s);
        if(result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
