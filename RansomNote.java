import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		boolean x = false;
		int temp = 0;
		Map<Character, Integer> map = new HashMap();
																	// Dumping magazine into the map
		for (char c : magazine.toCharArray())
			temp = map.containsKey(c) ? map.put(c, map.get(c) + 1) : map.put(c, 1);

																// Match ransomnote with the magazine
		for (char ch : ransomNote.toCharArray())
		temp = (map.containsKey(ch) && map.get(ch) > 0) ? map.put(ch, map.get(ch) - 1) : 0;
		x = (temp != 0) ? true : false;
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
