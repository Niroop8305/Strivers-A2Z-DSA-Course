import java.util.*;

class LongestsubarraywithsumK {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum=0,maxLength=0;
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            
            if(prefixSum==k){
                maxLength=i+1;
            }
            
            if (prefixMap.containsKey(prefixSum - k)) {
                int prevIndex = prefixMap.get(prefixSum - k);
                int length = i - prevIndex;
                maxLength = Math.max(maxLength, length);
            }
            
            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }
        
        return maxLength;   
    }
    public static void main(String[] args) {
        LongestsubarraywithsumK solution = new LongestsubarraywithsumK();
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int result = solution.longestSubarray(arr, k);
        System.out.println("Length of the longest subarray with sum " + k + " is: " + result);
    }
}
