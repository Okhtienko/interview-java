package majority_element;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[]{2, 2, 1, 1, 1, 2, 2};
		System.out.println(majorityElement(numbers));
	}

	public static int majorityElement(final int[] numbers) {
		Map<Integer, Integer> elements = new HashMap<>();
		int majorityElement = numbers.length / 2;

		for (int i = 0; i < numbers.length; i++) {
			elements.put(numbers[i], elements.getOrDefault(numbers[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
			if (entry.getValue()  > majorityElement) {
				majorityElement = entry.getKey();
			}
		}

		return majorityElement;
	}

}
