package array;

public class Urlify {

	public static void main(String[] args) {
		String input = "Mr John Smith    ";
		int trueLength = 13;
		char[] charArray = input.toCharArray();

		Urlify.replaceSpaces(charArray, trueLength);

		// Print the result
		System.out.println("URLified string: " + new String(charArray));
	}

	private static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0;
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ')
				spaceCount++;

		}
		int index = trueLength + (spaceCount * 2);
		if (trueLength < str.length)
			str[trueLength] = '\0';
		for (int i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[--index] = str[i];
			}
		}
	}

}
