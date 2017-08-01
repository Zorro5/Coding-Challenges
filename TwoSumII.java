import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

	public static int[] twoSum(int[] numbers, int target) {
		
		Map<Integer, Integer> map = new HashMap();
		int result[] = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i + 1;
				result[0] = map.get(target - numbers[i]) + 1;
				return result;
			} 
			map.put(numbers[i], i);
		}
		return result;
	}
	
	/*
	 * In-Place Solution - Using two pointers, just keep shrinking 
	 * the range of the search until you get a hit!!!
	 */
	
	public static int[] twoSum2(int[] numbers, int target) {
		int low = 0, high = numbers.length - 1;
		while (numbers[low] + numbers[high] != target) {
			if (numbers[low] + numbers[high] < target) {
				low++;
			}
			else{
				high--;
			}
		}
		return new int[] { low + 1, high + 1 };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
