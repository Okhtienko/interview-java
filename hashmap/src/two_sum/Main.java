package two_sum;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{3, 2, 4};
		final int target = 6;
		Arrays.stream(twoSum(numbers, target)).forEach(number -> System.out.print(number + " "));
	}

	public static int[] twoSum(final int[] numbers, final int target) {
		for (int i = 0; i < numbers.length; i++) {
			int value = target - numbers[i];
			int index = getIndex(numbers, value);

			if (index != -1 && index != i) {
				return new int[]{i, index};
			}
		}

		return new int[]{};
	}

	public static int getIndex(final int[] numbers, final int value) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == value) {
				return i;
			}
		}

		return -1;
	}

}
