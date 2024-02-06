package array;

import java.util.HashMap;
import java.util.Map;

public class FrequecnyOfCharacter {

	public static void main(String[] args) {
		String str="goutampandurang";
		preCharWithFreq(str);
	}
	public static void preCharWithFreq(String str) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(map.containsKey(c))
				System.out.print(c+Integer.toString(map.get(c))+" ");
			map.remove(c);
		}
	}
}
