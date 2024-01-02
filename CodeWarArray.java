import java.util.Arrays;

public class CodeWarArray {

	public static void main(String[] args) {

		int[] numbersToCheck = {7, 4, 3, 6, 5, 10, 2};

		System.out.println(Arrays.toString(squareElements(numbersToCheck)));

	}

	public static int[]	squareElements(int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] *= numbers[index];
		}

		for (int index = 0; index < numbers.length; index++) {
			for (int elements = 0; elements < numbers.length - 1; elements++) {
				if (numbers[elements] > numbers[elements + 1]) {
					int placeholder = numbers[elements];
					numbers[elements] = numbers[elements + 1];
					numbers[elements + 1] = placeholder;
				}
			}
		}

		//Arrays.sort(numbers);
		return numbers;
	}

}




