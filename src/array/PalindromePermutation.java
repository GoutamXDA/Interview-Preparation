package array;import java.io.CharConversionException;

public class PalindromePermutation {
	public static void main(String[] args) {
		String input1 = "taco cat";
		String input2 = "hello";

		System.out.println(isPermutationOfPalindrome(input1));
		System.out.println(isPermutationOfPalindrome(input2));
	}
/*
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = buildCharFrequecyTable(phrase);
		return checkMaxOneOdd(table);
	}

	private static int[] buildCharFrequecyTable(String phrase) {

		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
			}
		}
		return table;
	}

	private static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}

	private static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
*/

	private static boolean isPermutationOfPalindrome(String phrase) {
	    int countOdd = 0;
	    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
	    for (char c : phrase.toCharArray()) {
	        int x = getCharNumeric(c);
	        if (x != -1) {
	            table[x]++;
	            if (table[x] % 2 == 1) {
	                countOdd++;
	            } else {
	                countOdd--;
	            }
	        }
	    }
	    return countOdd <= 1;
	}

	private static int getCharNumeric(char c) {
	    int a = Character.getNumericValue('a');
	    int z = Character.getNumericValue('z');
	    int val = Character.getNumericValue(c);
	    if (a <= val && val <= z) {
	        return val - a;
	    }
	    return -1;
	}

}
