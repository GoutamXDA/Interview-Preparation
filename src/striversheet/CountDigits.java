package striversheet;

/*
 * https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
 * 
 */
public class CountDigits {
	public static void main(String[] args) {

		System.out.println(countDigits(336));
	}

	public static int countDigits(int n) {
		int count=0;
		int original=n;
		while(0<n) {
			int digit=n%10;
			if(digit!=0 && original%digit==0) {
				count++;
			}
			n/=10;
		}
		return count;
	}
}
