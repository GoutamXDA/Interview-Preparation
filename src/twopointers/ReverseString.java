package twopointers;

public class ReverseString {
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseCharArray(s1);
        System.out.println(java.util.Arrays.toString(s1));
    }

    public static void reverseCharArray(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
