import java.util.Scanner;
public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[]={2,4,3,4};
		int n= a.length;
		int sum = ((n+1)*(n+2))/2;
					for(int i=0;i<=a.length-1;i++){
				sum-=a[i];
			}
				
		// TODO Auto-generated method stub

	}

}
