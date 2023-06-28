import java.util.Scanner;
public class UpperTriangleSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
		System.out.println(arr[i][j]+" ");
	}
			System.out.println();
			}
		
		int sum=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
	
	if(i==0||i==2||(i==1&&j==0)||(i==1&&j==2)){
		sum+=arr[i][j];
	}
			}
				
			
		
	
		System.out.println("sum of all elements"+sum);
		// TODO Auto-generated method stub

	}

}
