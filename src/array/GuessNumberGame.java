package array;

public class GuessNumberGame extends GuessGame {

	public static int guessNumber(int n) {
		int start = 1; // Adjusted starting point
		int end = n;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			int result = guess(mid);
			if (result == 0) {
				return mid;
			} else if (result == 1) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 100; // Example range of numbers to guess
		int guessedNumber = guessNumber(n);

		if (guessedNumber != -1) {
			System.out.println("Guessed number is: " + guessedNumber);
		} else {
			System.out.println("Number not found within the given range.");
		}
	}
}