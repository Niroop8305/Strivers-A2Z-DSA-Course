class Patterns{
    public static void main(String[] args) {
        Patterns.pattern1();
        System.out.println();

        Patterns.pattern2();
        System.out.println();

        Patterns.pattern3();
        System.out.println();

        Patterns.pattern4();
        System.out.println();

        Patterns.pattern5();
        System.out.println();

        Patterns.pattern6();
        System.out.println();

        Patterns.pattern7();
        System.out.println();

        Patterns.pattern8();
        System.out.println();

        Patterns.pattern9();
        System.out.println();

        Patterns.pattern10();
        System.out.println();

        Patterns.pattern11();
        System.out.println();

        Patterns.pattern12();
        System.out.println();

        Patterns.pattern13();
        System.out.println();

        Patterns.pattern14();
        System.out.println();

        Patterns.pattern15();
        System.out.println();

        Patterns.pattern16();
        System.out.println();

        Patterns.pattern17();
        System.out.println();

        Patterns.pattern18();
        System.out.println();

        Patterns.pattern19();
        System.out.println();

        Patterns.pattern20();
        System.out.println();

        Patterns.pattern21();
        System.out.println();
        
        Patterns.pattern22();
        System.out.println();
    }

    static void pattern1() {
        // *****
        // *****
        // *****
        // *****
        // *****

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        // *
        // **
        // ***
        // ****
        // *****

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern3() {
        // 1
        // 12
        // 123
        // 1234
        // 12345

        int n=1;

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            n=1;
            System.out.println();
        }
    }

    static void pattern4() {
        // 1
        // 22
        // 333
        // 4444
        // 55555

        int n=1;

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
    }

    static void pattern5() {
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=0;i<5;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.err.println();
        }
    }

    static void pattern6() {
        // 12345
        // 1234
        // 123
        // 12
        // 1
        int n=1;
        for(int i=0;i<5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(n+" ");
                n++;
            }
            n=1;
            System.err.println();
        }
    }

    static void pattern7() {
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        int n=9;
        int k=n/2;
        int p=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j==k){
                    for(int m=0;m<p;m++){
                        System.out.print("* ");
                    }
                    p+=2;
                    k--;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern8() {
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        int n=9;
        int k=0;
        int p=n;
        for(int i=0;i<5;i++){
            if(k>n/2){
                break;
            }
            for(int j=0;j<5;j++){
                if(j==k){
                    for(int m=0;m<p;m++){
                        System.out.print("* ");
                    }
                    p-=2;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            k++;
        }
    }

    static void pattern9() {
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // *********
        //  *******
        //   *****
        //    ***
        //     *


        Patterns.pattern7();
        Patterns.pattern8();
    }

    static void pattern10() {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        int n=5,c=1;
        for(int i=0;i<(n*2)-1;i++){
            if(i<n-1){
                for(int k=0;k<c;k++){
                    System.out.print("* ");
                }
                c++;
            } else {
                for(int k=0;k<c;k++){
                    System.out.print("* ");
                }
                c--;
            }
            System.out.println();
        }
    }

    static void pattern11() {
        // 1
        // 01
        // 101
        // 0101
        // 10101

        int n=1;
        for(int i=0;i<5;i++){
            if(i%2==0){
                n=1;
            } else {
                n=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                if(n==0){
                    n++;
                } else {
                    n--;
                }
            }
            System.out.println();
        }
    }

    static void pattern12() {
        // 1      1
        // 12    21
        // 123  321
        // 12344321

        int n=1,req=4;
        for(int i=1;i<=req;i++){
            n=1;
            for(int j=1;j<=req*2;j++){
                if(j<=i){
                    System.out.print(n+" ");
                    n++;
                }
                else if(j>i && j<=req*2-i){
                    System.out.print("  ");
                } else {
                    n--;
                    System.out.print(n+" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern13() {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        int n=1,r=5;
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                if(n<10){
                    System.out.print(n+"  ");
                } else {
                    System.out.print(n+" ");
                }
                n++;
            }
            System.out.println();
        }
    }

    static void pattern14() {
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE

        char ch='A';
        int r=5;

        for(int i=0;i<r;i++){
            ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern15() {
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A

        char ch;
        int r=5;
        for(int i=0;i<r;i++){
            ch='A';
            for(int j=r;j>i;j--){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern16() {
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE

        char ch='A';
        int r=5;
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    static void pattern17() {
        //    A
        //   ABA
        //  ABCBA
        // ABCDCBA

        char ch;
        int r=4,c=r/2+1,col;
        for(int i=0;i<r;i++){
            ch='A'-1;
            col=i;
            c=r/2+1-i;
            for(int j=0;j<r*2-1;j++){
                if(j>=c && j<=r/2+1){
                    System.out.print(++ch+" ");
                    c++;
                } else if(col>0 && j>r/2+1){
                    System.out.print(--ch+" ");
                    col--;
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            col++;
        }
    }

    static void pattern18() {
        // E
        // DE
        // CDE
        // BCDE
        // ABCDE

        int n=5;
        char ch;
        for(int i=0;i<n;i++){
            ch=(char) ((char) 64+n-(char) i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+++" ");
            }
            System.out.println();
        }
    }

    static void pattern19() {
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********

        int req=5,n=req*2-1,cnt=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                if(i<req){
                    if(j<=n/2-i){
                        System.out.print("* ");
                    } else if(j>n/2+i){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if(j<=cnt){
                        System.out.print("* ");
                    } else if(j>=n-cnt){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
            if(i>=req){
                cnt++;
            }
        }
    }

    static void pattern20() {
        // *       *
        // **     **
        // ***   ***
        // **** ****
        // *********
        // **** ****
        // ***   ***
        // **     **
        // *       *

        int n=5,r=n*2-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i<=r/2){
                    if(j<=i){
                        System.out.print("* ");
                    }
                    else if(j>=r-i-1){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if(j<n){
                        System.out.print("* ");
                    } else if(j>=r-n){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            if(i>=r/2){
                n--;
            }
            System.out.println();
        }
    }

    static void pattern21() {
        // * * * *
        // *     *
        // *     *
        // *     *
        // * * * *

        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n){
                    System.out.print("* ");
                } else {
                    if(j==0 || j==n-1){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern22() {
        // 4444444
        // 4333334
        // 4322234
        // 4321234
        // 4322234
        // 4333334
        // 4444444
        
        int n=5,m=n,a=n*2-2;
        for(int i=0;i<=a;i++){
           int cnt=i;
           n=m;
           if(i<=a/2){
            for(int j=0;j<=a;j++){
                System.out.print(n+" ");
                if(cnt>0){
                    n--;
                    cnt--;
                }
                if(j>=a-i){
                    n++;
                }
            }
           } else {
            for(int j=0;j<=a;j++){
                System.out.print(n+" ");
                int k=a-i-1,l=k;
                if(j<=k){
                    k--;
                    n--;
                }
                if(j>=a-l-1){
                    n++;
                }
            }
           }
           System.out.println();
        }
    }
    
}