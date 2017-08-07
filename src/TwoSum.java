public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = len(nums);
        int res[];

        if( target < nums[len-1] ) return res;

        for( int i = nums-1; i > 0; i-- ){
            for( int j = i-1; j > -1; j-- ){
                if( target == nums[i] + nums[j] ){
                    res[0] = nums[j];
                    res[1] = nums[i];
                    return res;
                }
            }

        }
    }
}
