import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
/*
        for( int i = 0; i < nums.length; i++ ){
            for( int j = i+1; j < nums.length; j++ ){
                if( target == nums[i] + nums[j] ){
                    return new int[] {i, j};
                }
            }
        }

*/
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        System.out.println("hh");

        TwoSum obj = new TwoSum();
        int[] input = {1,4,6,7,8,9};
        System.out.println(input.length);
        System.out.println(Arrays.toString(input) );
        System.out.println(Arrays.toString( obj.twoSum(input, 15) )) ;

    }
}
