import java.util.*;
class FindTheUnion {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> unionSet = new HashSet<>();
        
        for(int x: a){
            unionSet.add(x);
        }
        
        for(int x: b){
            unionSet.add(x);
        }
        
        return new ArrayList<>(unionSet);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        ArrayList<Integer> union = findUnion(a, b);
        System.out.println(union);
    }
}
