package two_sum_II;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{2, 7, 11, 15};
		final int target = 9;
		Arrays.stream(twoSum(numbers, target)).forEach(value -> System.out.print(value + " "));
	}

	public static int[] twoSum(final int[] numbers, final int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				return new int[]{left + 1, right + 1};
			}

			if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return new int[]{};

	}

}
