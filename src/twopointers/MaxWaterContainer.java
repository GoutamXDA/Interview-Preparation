package twopointers;

public class MaxWaterContainer {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int area = h * (right - left);
            if (area > maxArea) maxArea = area;
            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
