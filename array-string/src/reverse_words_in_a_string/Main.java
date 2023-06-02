package reverse_words_in_a_string;

public class Main {
	public static void main(String[] args) {
		final String s = "the  sky is  blue";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(final String s) {
		final String[] words = s.replaceAll("\\s+", " ").split(" ");
		StringBuilder reverse = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reverse.append(words[i]).append(" ");
		}

		return reverse.toString().trim();
	}

}
