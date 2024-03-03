package miscellaneous;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class AsperCharacterFrequency {

	public static void main(String[] args) {
		System.out.println(frequencSort("giug"));
	}
	public static String frequencSort(String s) {
		StringBuilder result=new StringBuilder();
		if(s==null || s.length()==0) return result.toString();
		
		Map<Character, Integer> charCount=new HashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c,0)+1);
		}
		PriorityQueue<Character> maxHeap=new PriorityQueue<Character>((a,b)-> charCount.get(b)-charCount.get(a));
		for(char c:charCount.keySet()) {
			maxHeap.add(c);
		}
		while (!maxHeap.isEmpty()) {
			char current=maxHeap.remove();
			int count=charCount.get(current);
			for(int i=0;i<count;i++) {
				result.append(current);
			}
		}
		return result.toString();
	}
	p
}
