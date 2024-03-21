package infosys.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You have arraylist which contains names
 * input= {"Abhinav","Sarthak","Goutam","Soumya"};
 * get all the names having second character as o in above given list
 * 
 * output:{Goutam,Soumya}
 */
public class NameWithRequirement {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Abhinav");
		name.add("Sarthak");
		name.add("Goutam");
		name.add("Soumya");
		String[] filterdNames=getNames(name);
	//	System.out.println(Arrays.toString(filterdNames));
		
		System.out.println(Arrays.toString(getNamesByJava8(name)));
	}
// Using java 7 loop
	private static String[] getNames(ArrayList<String> name) {
		List<String> filtered=new ArrayList<String>();
		for (String str : name) {
			if(str.length()>1 && str.charAt(1)=='o') {
				filtered.add(str);
			}
		}
		return filtered.toArray(new String[0]);
	}
	private static String[] getNamesByJava8(ArrayList<String> names) {
		return names.stream()
				.filter(n->n.length()>1 && n.charAt(1)=='o')
				.toArray(String[]::new);
		
}
}
