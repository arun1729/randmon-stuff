public class Median {

	public static void main(String[] args) {
		// 2,2,3,5,7,8
		int[] arr = { 5, 2, 7, 3, 2, 8 };
		Median m = new Median();
		// m.quickSort(arr, 0, arr.length - 1);
		// m.bubbleSort(arr);
		// m.bubbleSort(arr);
		m.median(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	void median(int[] arr, int right, int left) {
	}

	void quickSort(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}

		if (left < j)
			quickSort(arr, left, j);
		if (i < right)
			quickSort(arr, i, right);
	}

	void bubbleSort(int[] arr) {
		int tmp;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					flag = true;
				}
			}
		}
	}
}
