class Geeks {
    public static void main(String[] args) {
        // Initializing variables
        int a = 10; // Integer
        float b = 20.5f; // Float
        double c = 30.5; // Double
        long l = 40L; // Long
        byte d = 50; // Byte

        // Calling the method to perform operations
        dataTypes(a, b, c, l, d);
    }
    static void dataTypes(int a, float b, double c, long l, byte d) {

        double p = c/b; // c/b
        double q = b/a; // b/a
        double r = c/a; // c/a
        double m = r+l; // r+l
        int s = a/d;    // a/d

        // Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }
}