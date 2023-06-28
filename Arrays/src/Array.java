import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int length = scan.nextInt();
		int a[] = new int[5];
		int product=1;
		for(int i=0;i<a.length;i++){
			System.out.println("enter the values of array");
			a[i] = scan.nextInt();
		}
		System.out.println("sum of the array ......");
		 for(int i=0;i<a.length;i++){
			 product=product*a[i];
			 
		 }
		 System.out.println(product);
		
	}

}
