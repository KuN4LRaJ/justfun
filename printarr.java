import java.util.Scanner;
public class printarr {
	
	public static void main(String[] args) {
		int i, sum=0;
		int arr[] = new int[10];
		
		System.out.println("Enter 10 numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		
		System.out.print("The numbers are:\n");
		
		for(i=0;i<10;i++)
			System.out.println(arr[i]);
	}

}