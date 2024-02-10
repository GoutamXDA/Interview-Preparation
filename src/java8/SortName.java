package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortName {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Mahesh");
		name.add("Sanjay");
		name.add("Praveen");
		name.add("Anu");
		name.add("Sandhya");
		
		List<String > nameE=new ArrayList<String>();
		nameE.add("John");
		nameE.add("Rock");
		nameE.add("Sam");
		nameE.add("Kite");
		
		System.out.println("Sort using java 7");
		SortName sortName=new SortName();
		sortName.sortUsingJava7(name);
		System.out.println(name);
		
		System.out.println("Sort using java 8");
		sortName.sortUsingJava8(nameE);
		System.out.println(nameE);
	}
	private void sortUsingJava7(List<String> names) {   
	      Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   private void sortUsingJava8(List<String> names) {
		      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
		   }
	}
