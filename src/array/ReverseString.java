package array;

public class ReverseString {
	public static void main(String[] args) {

		String name = "Goutam";
		System.out.println((reversed(name)));
	}

	private static String reversed(String name) {
	/*	char[] charArray = name.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;

			left++;
			right--;
		}
		return new String(charArray);
		*/
		/*
		String str="";
		for(int i=name.length()-1;i>=0;i--) {
			str+=name.charAt(i);
		}
		return str;
		*/
		StringBuilder sb=new StringBuilder();
		for(int i=name.length()-1;i>=0;i--) {
			sb.append(name.charAt(i));
		}
		return sb.toString();
	}
}
