
public class MinMax {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		findMinMax(arr);
	}
	
	static void findMinMax(int[] arr) {
		if(arr == null || arr.length==0)
			return;
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("Minimum number is:" + min);
		System.out.println("Maximum number is:" + max);
	}
}
