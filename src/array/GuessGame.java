package array;

public class GuessGame {
	private static final int PICKED_NUMBER = 6;

	public static int guess(int num) {
		if (num > PICKED_NUMBER) {
			return -1;
		} else if (num < PICKED_NUMBER) {
			return 1;
		} else {
			return 0;
		}
	}
}
