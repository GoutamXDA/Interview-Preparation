package array;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class PascalSTriangle {

	public static void main(String[] args) {
		
	}
	
	   public static List<List<Integer>> generate(int numRows) {

		     List<List<Integer>> triangle=new ArrayList<>();
		     if(numRows==0) return triangle;
		     
		     List<Integer> firstRow=new ArrayList<Integer>();
		     
		     firstRow.add(1); 
		     triangle.add(firstRow);
		     
		     for (int i = 1; i < numRows; i++) {
				List<Integer> prevRow=new ArrayList<Integer>();
				List<Integer> row=new ArrayList<Integer>();
				row.add(1);
				for (int j = 1; j < i; j++) {
					row.add(prevRow.get(j-1)+prevRow.get(j));
				}
				row.add(1);
				triangle.add(row);
			}
		     return triangle;
		    }
}
