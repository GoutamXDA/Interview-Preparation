package striversheet;
/*
 * https://www.codingninjas.com/studio/problems/if-else-decision-making_8357235?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
 */
public class DecsionMaking {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		System.out.println(compraeIfElse(a, b));
	}
	public static String compraeIfElse(int a,int b) {
		/*if(a==b) return "equal";
		else if(a>b) return "greater";
		else return "smaller";
	}*/
		return (a==b) ? "equal":(a>b) ? "greater":"smaller";
	}
}
