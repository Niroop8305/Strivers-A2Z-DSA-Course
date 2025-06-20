class SwitchStatement {
    public static void main(String[] args) {
        // Example usage
        System.out.println(isInRange(5));  // Output: five
        System.out.println(isInRange(11)); // Output: not in range
    }
    static String isInRange(int N) {
        // code here
        switch(N){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return "not in range";
        }
    }
}
