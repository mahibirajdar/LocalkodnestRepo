import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of rows");
		int m = scan.nextInt();
		System.out.println("enter number of columns");
		int n = scan.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		System.out.println("enter the values for mat");
		for(int i=0;i<=m-1;i++){
			if(i%2==0){
				for(int j=0;j<=n-1;j++){
					b[i][j]=a[i][j];
					}
			}
				else
				{
					for(int j=0;j<=n-1;j++){
						b[i][j]=a[i][m-1-j];
					}
				}
		}
				
			System.out.println("enter the values for mat");
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("values of mat");
		for(int i=0;i<=m-1;i++){
			for(int j=0;j<=n-1;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
