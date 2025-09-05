import java.util.*;
class LeadersInAnArrayProblem {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxFromRight=arr[arr.length-1];
        result.add(maxFromRight);
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=maxFromRight){
                maxFromRight=arr[i];
                result.add(maxFromRight);
            }
        }
        
        Collections.reverse(result);
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = LeadersInAnArrayProblem.leaders(arr);
        System.out.println("Leaders in the array are: " + result);
    }
}
