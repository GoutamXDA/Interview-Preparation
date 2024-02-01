package array;

public class NumberOfIsland {

	public static void main(String[] args) {
		int[][] grid = { 
				{ 1, 1, 0, 0, 0 }, 
				{ 1, 1, 1, 0, 0 }, 
				{ 0, 0, 1, 1, 0 }, 
				{ 0, 0, 0, 1, 1 } };

		NumberOfIsland numberOfIsland = new NumberOfIsland();
		int count = numberOfIsland.numIsland(grid);
		System.out.println("Number of islands: " + count);
	}

	public int numIsland(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					count++;
					callBfs(grid, i, j);
				}
			}
		}
		return count;
	}

	private void callBfs(int[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0)
			return;
		grid[i][j] = 0;

		callBfs(grid, i - 1, j);
		callBfs(grid, i + 1, j);
		callBfs(grid, i, j - 1);
		callBfs(grid, i, j + 1);
	}
}
