import java.util.Arrays;

public class TimePass {

	public static void kyaHua(String s){
		char[] array = s.toCharArray();
		Arrays.sort(array);
		int index = 0;
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] != array[i + 1]){
				array[index++] = array[i];
			}
		}
		for(char c: array){
			System.out.print(c + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("aabbbcccddeeeff");
		kyaHua(s);
	}

}
