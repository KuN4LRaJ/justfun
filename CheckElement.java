import java.util.Scanner;

public class CheckElement {

	public static void main(String[] args) {
		int arr[]= {1,3,67,32,5,7};
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the element you want to check:");
		int toFind = sc.nextInt();
		
		for(int n: arr) {
			if(n == toFind) {
				check = true;
				break;
			}
		}
		if(check) {
			System.out.print(toFind + " is present.");
		}
		else {
			System.out.print(toFind + " is not present.");
		}		
	}
}