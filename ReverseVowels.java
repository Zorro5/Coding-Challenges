
public class ReverseVowels {
	public static String reverseVowels(String s) {
		char array[] = s.toCharArray();
		int start = 0, end = array.length;
		String vowels = "aeiouAEIOU";
		while(start < end){
			while(start < end && !vowels.contains(array[start] + "")){		// Slip in the + "" part coz it takes only
				start++;												// strings as i/p parameters. 
			}
			while(start < end && !vowels.contains(array[end] + "")){
				end--;
			}
			char temp = array[start];
			array[start]  = array[end];
			array[end] = temp;
		}
		return new String(array);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
