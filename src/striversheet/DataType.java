package striversheet;

import java.util.HashMap;

/*
 * https://www.codingninjas.com/studio/problems/data-type_8357232?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class DataType {
public static void main(String[] args) {
	String type="Long";
	System.out.println(dataType(type));
}
public static int dataType(String type) {
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	map.put("Integer", 4);
	map.put("Long", 8);
	map.put("Float", 4);
	map.put("Double", 8);
	map.put("Character", 1);

	return map.getOrDefault(type, -1);
}

}
