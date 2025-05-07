package DAY1;

public class Program2 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalsum= (n*(n+1))/2;
        int arsum=0;
        for(int i=0;i<n;i++){
             arsum=arsum +nums[i];
        }
        int missing=totalsum-arsum;
        
         return missing;
    }
}
