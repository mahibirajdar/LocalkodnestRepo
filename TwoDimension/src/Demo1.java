import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
					Scanner scan = new Scanner(System.in);
				System.out.println("enter number of rows");
				int rows = scan.nextInt();
				System.out.println("enter number of columns");
				int columns = scan.nextInt();
				int mat1[][] = new int[rows][columns];
				int mat2[][] = new int[rows][columns];
				System.out.println("enter the values for mat1");
				for(int i=0;i<=rows-1;i++){
					for(int j=0;j<=columns-1;j++){
						mat1[i][j] = scan.nextInt();
					}
				}
				System.out.println("enter the values for mat2");
				for(int i=0;i<=rows-1;i++){
					for(int j=0;j<=columns-1;j++){
						mat2[i][j] = scan.nextInt();
					}
				}
				System.out.println("values of mat1");
				for(int i=0;i<=rows-1;i++){
					for(int j=0;j<=columns-1;j++){
						System.out.print(mat1[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("values of mat2");
				for(int i=0;i<=rows-1;i++){
					for(int j=0;j<=columns-1;j++){
						System.out.print(mat2[i][j]+" ");
					}
					System.out.println();
				}
				int mat3[][] = new int[rows][columns];
				System.out.println("division of two matrices mat1 and mat2");
				for(int i=0;i<=rows-1;i++){
					for(int j=0;j<=columns-1;j++){
						
								mat3[i][j] = mat1[i][j]/mat2[i][j];
							}
					
				}
				System.out.println("values of mat3");
				for(int i=0;i<=rows-1;i++){
					for(int j=0;j<=columns-1;j++){
						System.out.print(mat3[i][j]+" ");
					}
					System.out.println();
				}
		}

		
				
	}


