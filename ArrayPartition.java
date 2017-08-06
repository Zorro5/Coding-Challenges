 
 
 
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Two pointer approach!
		
        Arrays.sort(nums1); 
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList();
        int index1 = 0, index2 = 0;
		
		//Loop until the end of the shorter array
        while(index1 < nums1.length && index2 < nums2.length){
			
			//Keep moving the pointers accordingly, as the arrays are sorted now. 
            if(nums1[index1] < nums2[index2]){
                index1++;
            }
            else if(nums1[index1] > nums2[index2]){
                index2++;
            }
            else{
                list.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        
        int result[] = new int[list.size()];
        for(int i = 0; i < result.length; i++){
			result[i] = list.get(i); 
		}
		return result;
        
        /*
    	//int result[] = new int[20];
		List<Integer> list = new ArrayList();
		Map<Integer, Integer> map = new HashMap();
		for(int i : nums1){
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			}
			else map.put(i, 1);
		}
		
		int index = 0;
		for(int i : nums2){
			if(map.containsKey(i) && map.get(i) > 0){
				map.put(i, map.get(i) - 1);
                list.add(i);
			}
			//result[index++] = i;
		}
		
		int result[] = new int[list.size()];
		for(int i = 0; i < result.length; i++){
			result[i] = list.get(i); 
		}
		return result;
        */
        
    }
}