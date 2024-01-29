package array;

public class OneAway {

	public static void main(String[] args) {
		String s = "pale";
		String t = "ple";
		boolean isOneEdit = oneEditAway(s, t);
		System.out.println(isOneEdit);
	}

	private static boolean oneEditAway(String s, String t) {
		if (s.length() == t.length()) {
			return oneEditReplace(s, t);
		} else if (s.length() + 1 == t.length()) {
			return oneEditInsert(s, t);
		}
		else if(s.length()-1==t.length()) {
			return oneEditInsert(t, s);
		}
		return false;
	}

	private static boolean oneEditInsert(String s, String t) {
		int index1=0,index2=0;
		while (index2<t.length() && index1<s.length()) {
			if(s.charAt(index1)!=t.charAt(index2)) {
				if(index1!=index2) {
					return false;
				}
				index2++;
			}else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	private static boolean oneEditReplace(String s, String t) {
		boolean foundDifference = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				if (foundDifference)
					return false;
				foundDifference = true;
			}
		}
		return true;
	}

}
