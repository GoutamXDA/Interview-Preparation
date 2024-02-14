package array;

public class ValidPalindrome {
	public static void main(String[] args) {
		String str="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String s) {
		String str = "";
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				str += c;
			}
		}
		str = str.toLowerCase();

		int start = 0;
		int end = str.length() - 1;
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start += 1;
			end -= 1;
		}
		return true;
	}
}
