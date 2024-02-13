package array;

public class FIndFirstBadVersion extends VersionControl {
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isBadVersion(mid)) {
				end = mid - 1; // Adjusting the end pointer
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		FIndFirstBadVersion solution = new FIndFirstBadVersion();
		int n = 10; 
		int firstBad = solution.firstBadVersion(n);
		System.out.println("The first bad version is: " + firstBad);
	}
}
