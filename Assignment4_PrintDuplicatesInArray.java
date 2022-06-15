package week1.day2Assignment;

public class Assignment4_PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = +1;
				}
			}
			if (count > 0) {
				System.out.println(arr[0]);
				System.out.println(count);
			}

		}

	}
}
