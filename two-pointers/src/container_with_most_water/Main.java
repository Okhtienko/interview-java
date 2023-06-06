package container_with_most_water;

public class Main {
	public static void main(String[] args) {
		final int[] height = new int[]{2, 3, 4, 5, 18, 17, 6};
		System.out.println(maxArea(height));
	}

	public static int maxArea(final int[] height) {
		int maxArea = 0;
		int leftBorder = 0;
		int rightBorder = height.length - 1;

		while (leftBorder < rightBorder) {
			int length = Math.min(height[leftBorder], height[rightBorder]);
			int area = length * (rightBorder - leftBorder);
			maxArea = Math.max(maxArea, area);

			if (height[leftBorder] <= height[rightBorder]) {
				leftBorder++;
			} else {
				rightBorder--;
			}

		}

		return maxArea;
	}

}
