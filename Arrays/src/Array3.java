import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0;i<a.length;i++){
			System.out.println("enter the values of array");
			a[i] = scan.nextInt();
		}
		System.out.println("array contents are......");
		for(int i=0;i<a.length;i++){
			if(i%2!=0){
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub
		}
	}

}
