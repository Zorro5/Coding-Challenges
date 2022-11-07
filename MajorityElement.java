import java.util.HashMap;
import java.util.Map;

/**
*/
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
           if(map.containsKey(nums[i])){
               map.put(nums[i], map.get(nums[i]) + 1);
           }
            else{
                map.put(nums[i], 1);
            }
            if(map.get(nums[i]) > nums.length / 2){
                count = nums[i];
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
