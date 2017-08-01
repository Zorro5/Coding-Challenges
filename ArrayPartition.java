import java.util.Arrays;

public class ArrayPartition {

	 public static int arrayPairSum(int[] nums) {
		 Arrays.sort(nums);
		 int sum = 0;
		 for(int i = nums.length - 1; i > 0; i -= 2){
			 sum += nums[i - 1];
			 System.out.println(sum);
		 }
		 return sum;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {0,-1,-2,-3};
		System.out.println("Max Sum: " + arrayPairSum(array));

	}

}
