public class RemoveElement {

    public int removeElement(int[] nums, int val) {
      
    	if( nums.length == 0 ) return 0;

		int len = 0;
		for( int i = 0; i < nums.length; i++ ){
			if( nums[i] != val ){
				nums[len] = nums[i];
				len++;
			}
		}
		return len;
    }

	public static void main(String[] args){
		RemoveElement obj = new RemoveElement();
		int[] nums = {3,3};
		int val = 3;

		System.out.println(obj.removeElement ( nums, val ));
		System.out.println( nums );
	}
}
