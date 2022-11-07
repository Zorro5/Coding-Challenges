
/**
*/
public class Consecutive1s {

	public class Solution {
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int max = 0, count = 0;
	        for(int i : nums){
	            count++;
	            if(i == 0) count = 0;
	            if(count > max) max = count;
	        }
	        return max;
	    }
	}

	// Same logic, Less code! Use the follwing operators for God Sake!!!!
	/*
	for(int i : nums){
	max = Math.max(max, count = (i == 0) ? 0 : count + 1);
	}
	return max;
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
