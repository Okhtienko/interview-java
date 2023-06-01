package find_the_index_of_the_first_occurrence_in_a_string;

public class Main {
	public static void main(String[] args) {
		final String haystack = "sadbutsad";
		final String needle = "sad";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(final String haystack, final String needle) {
		return haystack.indexOf(needle);
	}

}
