public class MaxSubarray {
    
    public int maxSubArray ( int[] nums ){
        
        int prevSum = 0;
        
        for ( int i = 0; i < nums.length; i++ ) {
            int currSum = prevSum + nums[i];

            if ( currSum < nums[i] ){
                prevSum = nums[i];
            } else {
                prevSum = currSum;
            }
            

        }
        return sum;
    }
}
