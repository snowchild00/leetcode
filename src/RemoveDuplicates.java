public class Solution {
    public int removeDuplicates(int[] nums) {

      if( nums == null || nums.length == 0 )
        return 0;
      if( nums.length == 1 )
        return nums.length;
      
      int prev = nums[0];
      int len = 0;
      for( int i = 1; i < nums.length; i++ ){
        if( prev != nums[i] ){
          len++;
          prev = nums[i];
        }
        
      }
      
      return len;
      
    }
}
