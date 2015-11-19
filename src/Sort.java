public class Sort {

	public static void main(String[] args) {
		Sort sort = new Sort();
		int arr[] = { 6, 5, 3, 9, 10, 2, 8, 3, 1, 7, 4, 4, 5 };
		sort.quickSortMedian(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	void quickSortMedian(int[] arr, int left, int right) {
		int pivot = arr[(right+left)/2];
//		System.out.println("~~ pivot: "+pivot+" index:"+left);
		int i = left;
		int j = right;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;

			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(arr[i]==pivot){
			//System.out.println("i "+i);
			if(i==(arr.length+1)/2){
				System.out.println("median: "+arr[i]);
			}
		}else if (j>0){
			if(arr[j]==pivot)
				if(j==(arr.length+1)/2){
					System.out.println("median: "+arr[j]);
				}
		}
		
//		System.out.println("i "+arr[i]);
//		System.out.println("j "+arr[j]);
//		System.out.println("left "+arr[left]);
//		System.out.println("right "+arr[right]);
//		System.out.println("-----------------");
//		
//		for(int n : arr){
//			System.out.print(n+",");
//		}
//		System.out.println("\n-----------------");
		
		if (left < j) {
			quickSortMedian(arr, left, j);
		}

		if (right > i) {
			quickSortMedian(arr, i, right);
		}

	}
}
