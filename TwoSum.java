import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int arr[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
	
	/*
	 * In the following method, I first put the array in the map using first loop and then used a second 
	 * loop for checking the target sum, but INSTEAD, you could just check the target sum simultaneously
	 * when you are trying to put the elements into the map, thus using only one loop for the entire problem.
	 */
	
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap();
		int array[] = new int[2];
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], i);
		}
		for(Map.Entry<Integer, Integer> m: map.entrySet()){
			if(map.containsKey(target - m.getKey())){
				array[0] = m.getValue();
				array[1] = map.get(target - m.getKey());
			}
		}
		return array;
	}
	
	/*
	 * Just Like this one ! (Good Job)
	 */
	public int[] twoSum3(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i + 1);
	    }
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1,2,3,4,5,6,7,8,9,11,15,16,18,25,36,95};
		int result[] = new int[2];
		result = twoSum2(array,96);
		for(int i : result){
			System.out.println(i);
		}
		
	}

}
