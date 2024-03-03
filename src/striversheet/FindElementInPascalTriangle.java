package striversheet;

public class FindElementInPascalTriangle {

	public static void main(String[] args) {
		int row=5;
		int col=2;
		int fondElement=getElementFromPascal(row-1,col-1);
		System.out.println(fondElement);
	}

	private static int getElementFromPascal(int n, int c) {
		int res=1;
		for(int i=0;i<c;i++) {
			res=res*(n-i);
			res=res/(i+1);
		}
		return res;
	}
}
