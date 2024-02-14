package array;

public class ReverseNumber {

	public static void main(String[] args) {
		int x=12321;
		System.out.println(isNumberPalindrome(x));
	}
	public static boolean isNumberPalindrome(int x) {
		if(x==0) return true;
		if(x<0 || x%10==0) return false;
		
		int rev=0;
		while (x>rev) {
			int pop=x%10;
			x/=10;
			rev=(rev*10)+pop;
		}
		
		if(x==rev || x==rev/10) return true;
		else {
			return false;
		}
	}
}
