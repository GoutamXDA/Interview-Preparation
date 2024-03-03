package striversheet;

/*
 * https://www.codingninjas.com/studio/problems/switch-case-statement_8357244?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
 */
public class SwitchCaseStatement {

	public static void main(String[] args) {
		int ch=1;
		double[]a= {2};
		System.out.println(areaSwitchCase(ch, a));
	}

	public static double areaSwitchCase(int ch, double[] a) {
		switch (ch) {
		case 1:
			double r=a[0];
			return Math.PI * r*r;
		case 2:
			double l=a[0];
			double b=a[1];
			return l*b;

		default:
			return 0;
		}
	}
}
