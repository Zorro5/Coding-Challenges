
/**
 Solve this problem using a circular array ?
*/
public class RotateArray {

	public static void rotate(int[] nums, int k) {

		int index = 0, temp = 0;
		for(int i = nums.length - k; i < nums.length; i++){
			temp = nums[index];
			nums[index++] = nums[i];
		}
		for(int i : nums) System.out.print(i + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		rotate(array, 3);
	}

}
