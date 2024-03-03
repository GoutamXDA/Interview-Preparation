package striversheet;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * https://www.codingninjas.com/studio/problems/zero-matrix_1171153?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class SetMatrixZeros {
	public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 0, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        
        int n = 3; 
        int m = 3; 
        ArrayList<ArrayList<Integer>> result = zeroMatrix(matrix, n, m);
        
        // Printing the result
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }

	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
		boolean[] rowZeros=new boolean[n];
		boolean[]colZeros=new boolean[m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix.get(i).get(j)==0) {
					rowZeros[i]=true;
					colZeros[j]=true;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(rowZeros[i]) {
				nullifyRow(matrix,i,m);
			}
		}
		
		for(int i=0;i<m;i++) {
			if(rowZeros[i]) {
				nullifyCol(matrix,i,n);
			}
		}
		
		return matrix;
	}

	private static void nullifyCol(ArrayList<ArrayList<Integer>> matrix, int i, Integer n) {
		for (int j = 0; j < n; j++) {
			matrix.get(j).set(i, 0);
		}
	}

	private static void nullifyRow(ArrayList<ArrayList<Integer>> matrix, int i, Integer m) {
		for (int j = 0; j < m; j++) {
			matrix.get(i).set(j, 0);
		}
	}
}
