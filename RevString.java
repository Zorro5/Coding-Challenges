
public class RevString2 {
	
    public static String reverseStr(String s, int k) {
        char[] s1 = s.toCharArray();
        int j = 0;
        for(int i = 0; i < k; i++){
            reverse(s1, j, j + k-1);
            j = 2 * k;
        }
        return new String(s1);
    }
    
    public static void reverse(char[] s, int l, int r){
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++; r--;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = reverseStr("abcdefg", 2);
		System.out.println(s);
		
	}

}
