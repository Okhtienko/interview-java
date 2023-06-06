package valid_palindrome;

public class Main {
	public static void main(String[] args) {
		final String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(final String s) {
		final String phrase = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		StringBuffer palindrome = new StringBuffer(phrase);
		return phrase.equals(palindrome.reverse().toString());
	}

}
