import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int length = scan.nextInt();
		int a[] = new int[length];
		int even=0,odd=0;
		for(int i=0;i<a.length;i++){
			System.out.println("enter the values of array");
			a[i] = scan.nextInt();
		}
		System.out.println("sum of the array ......");
		 for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				even+=a[i];
			}
			else{
				odd+=a[i];
			}
		}
		 System.out.println("sum of even elements in array:"+even);
		 System.out.println("sum of odd elements in array:"+odd);
		
		// TODO Auto-generated method stub

	}

}
