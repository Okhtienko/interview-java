package minimum_size_subarray_sum;

public class Main {
	public static void main(String[] args) {
		final int target = 7;
		final int[] nums = new int[]{2, 3, 1, 2, 4, 3};
		System.out.println(minSubArrayLen(target, nums));
	}

	public static int minSubArrayLen(final int target, final int[] numbers) {
		int left = 0;
		int sum = 0;
		int minLength= Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			while (sum >= target) {
				minLength = Math.min(minLength, i - left + 1);
				sum -= numbers[left];
				left++;
			}
		}

		return minLength;
	}

}
