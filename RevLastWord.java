import java.util.StringTokenizer;

/**
*/
public class RevLastWord {
	public static int lengthOfLastWord(String s) {
		   if(s.length() == 0 || s.trim().length() == 0) return 0;
	        int count = 0, j = 0;
	        char array[] = s.toCharArray();
	        for(j = array.length - 1; array[j] == ' '; j--){}
	        for(int i = j; i >= 0 && array[i] != ' '; i--)
	            count++;
	        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = lengthOfLastWord("  ");
		System.out.println(x);
		
	}

}
