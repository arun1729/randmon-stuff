public class Diag {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 1,2,3,4 }, 
				{ 4,5,6,7 }, 
				{ 8,9,10,11 },
				{ 12,13,14,15 } 
				};
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i][i]);
		// }
		// for (int i= arr.length-1; i >= 0 ; i--) {
		// System.out.println(arr[i][i]);
		// }
		//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j <=i; j++) {
//				System.out.print(arr[j][i-j]+",");
//			}
//			System.out.print("\n");
//		}
		for (int i = 0; i < arr.length ; i++) {
			for (int j = arr.length-1; j >=i; j--) {
				System.out.print(i+","+j+" ");
			}
			System.out.print("\n");
		}
	}
}
