import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = scan.nextInt();
		System.out.println("enter number of columns");
		int columns = scan.nextInt();
		int mat[][] = new int[rows][columns];
		System.out.println("enter the values for mat");
		for(int i=0;i<=rows-1;i++){
			for(int j=0;j<=columns-1;j++){
				mat[i][j] = scan.nextInt();
			}
		}
		System.out.println("values of mat");
		for(int i=0;i<=rows-1;i++){
			for(int j=0;j<=columns-1;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=rows-1;i++){
			for(int j=0;j<=columns-1;j++){
				if(i==j){
					sum1=sum1+mat[i][j];
				}
			 if((i+j)==rows-1){
					sum2=sum2+mat[i][j];
				}
				
			}
				System.out.println();
		}
				System.out.println("sum of diagonal elements are"+sum1+" "+sum2);
					
				}
			
		
		
		// TODO Auto-generated method stub

	}


