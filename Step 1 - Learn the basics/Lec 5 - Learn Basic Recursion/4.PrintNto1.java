import java.util.Scanner;
class PrintNto1  {
    static void printNum(int n){
        if(n>0){
            System.out.println(n--);
            printNum(n);
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        PrintNto1.printNum(n);
        sc.close();
    }
}
