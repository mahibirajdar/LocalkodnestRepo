import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int length = scan.nextInt();
		int a[] = new int[5];
		int even=0,odd=0;
		for(int i=0;i<a.length;i++){
			System.out.println("enter the values of array");
			a[i] = scan.nextInt();
		}
		System.out.println("reversed array contents are: ......");
		 for(int i=a.length-1;i>=0;i--){
			 System.out.print(a[i]+" ");
		 }
		
		 
		// TODO Auto-generated method stub

	}

}
