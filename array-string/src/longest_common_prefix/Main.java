package longest_common_prefix;

public class Main {
	public static void main(String[] args) {
		final String[] strs = new String[]{"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(final String[] strs) {
		String prefix = "";

		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 1; j < strs.length; j++) {
				if ((strs[j].length() == i) || (strs[j].charAt(i) != strs[0].charAt(i))) {
					return prefix;
				}
			}
			prefix += strs[0].charAt(i);
		}

		return prefix;
	}

}
