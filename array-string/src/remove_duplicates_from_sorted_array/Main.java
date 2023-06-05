package remove_duplicates_from_sorted_array;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		System.out.println(removeDuplicates(numbers));
	}

	public static int removeDuplicates(final int[] numbers) {
		int k = 1;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] != numbers[i - 1]) {
				numbers[k] = numbers[i - 1];
				k++;
			}
		}

		return k;
	}

}
