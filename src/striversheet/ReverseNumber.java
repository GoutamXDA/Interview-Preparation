package striversheet;

/*
 * https://www.codingninjas.com/studio/problems/reverse-bits_2181102?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseBits(123));
	}

	public static long reverseBits(long n) {
		long reversed=0;
		while(n!=0) {
			long digit=n%10;
			reversed=reversed*10+digit;
			n/=10;
		}
		return reversed;
	}
}
