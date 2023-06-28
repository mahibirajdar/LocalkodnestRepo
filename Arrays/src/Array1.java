import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0;i<a.length;i++){
			System.out.println("enter the values of array");
			a[i] = scan.nextInt();
		}
		System.out.println("array contents are......");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
