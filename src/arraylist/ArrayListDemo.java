package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(0);
		System.out.println(list);
		
		// ArrayList to array
		var array = list.toArray();
		System.out.println(Arrays.toString(array));
	}
}
