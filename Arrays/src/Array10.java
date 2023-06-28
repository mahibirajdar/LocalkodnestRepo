import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0;i<a.length;i++){
			System.out.println("enter the values of array");
			a[i] = scan.nextInt();
		}
		System.out.println("sum of the array ......");
		 int sum;
		 sum=0;
		for(int i=0;i<a.length;i++){
		
			sum=sum+a[i];
		
		}
		System.out.println(sum);
		float avg = sum/(a.length);
		System.out.println(avg);
		// TODO Auto-generated method stub
		}
	}