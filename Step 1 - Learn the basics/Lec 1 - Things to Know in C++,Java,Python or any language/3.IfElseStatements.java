class IfElsseStatements {
    public static void main(String[] args) {
        // Example usage
        System.out.println(compareNM(5, 10)); // Output: lesser
        System.out.println(compareNM(10, 10)); // Output: equal
        System.out.println(compareNM(15, 10)); // Output: greater
    }
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            return "lesser";
        } else if(n==m){
            return "equal";
        } else {
            return "greater";
        }
    }
}