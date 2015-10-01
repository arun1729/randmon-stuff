import java.util.ArrayList;

public class Subarray {

	public static void main(String[] Args) {
		int[] arr = { 1, 2, -5, 10, 20, 30, -3, 0, 1, -7, -10, 5 };
		int sum = 0;
		int max = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> maxlist = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum >= max) {
				max = sum;
				list.add(arr[i]);
				maxlist = list;
			} else {
				list = new ArrayList<Integer>();
				sum = 0;
			}
		}
		System.out.println(maxlist.toString());
		System.out.println(max);
	}
}
