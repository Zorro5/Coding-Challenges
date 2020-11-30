import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 Move all the zeroes in the array to the left or right of the array.
*/
public class MoveZeroes {
	
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap();
		for(Map.Entry<Integer, Integer> m: map.entrySet()){
			
		}
		
		Set s = new HashSet();
		
		int array[] = {1,2,0,3,0,5,6,0,0,8};
		moveZeroes(array);
	}

}
