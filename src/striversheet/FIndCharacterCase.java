package striversheet;
/*
 * https://www.codingninjas.com/studio/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class FIndCharacterCase {

	public static void main(String[] args) {
		char c='1';
		System.out.println(checkCharacterType(c));
	}
	public static int checkCharacterType(char c) {
		if(c>='A' && c<='Z') return 1;
		else if(c>='a' && c<='z') return 0;
		else return -1;
	}
	
}
