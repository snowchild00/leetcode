import java.util.Arrays;
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

		for( int i = 0; i < nums.length; i++ ){
			if( target == nums[i] || target < nums[i] ) 
				return i;
		}
		return nums.length;
    }


	public static void main(String[] args){
		SearchInsertPosition obj = new SearchInsertPosition();

/*
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
*/


		int[] nums = {1,3,5,6};
		int target = 0;
		System.out.println( Arrays.toString(nums) );
		System.out.println( target ); 
		System.out.println( obj.searchInsert(nums, target) );
	
	}

}
