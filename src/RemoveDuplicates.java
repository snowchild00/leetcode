public class RemoveDuplicates{

    public int removeDuplicates2(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
	}


	public static void main(String[] args){

		RemoveDuplicates obj = new RemoveDuplicates();
		int[] input = {1,1,2};
		System.out.println(obj.removeDuplicates2 ( input ));

	}
}
