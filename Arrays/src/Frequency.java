import java.util.Scanner;
public class Frequency {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int arr[] = new int[scan.nextInt()];
	System.out.println("enter the array elements");
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
		boolean visited[] = new boolean[arr.length];
		for(int i=0;i<=arr.length-1;i++){
			if(visited[i]==true){
				continue;
			}
		
			int count=1;
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i]==arr[j]){
				count++;
				visited[j]=true;
			}
		}
		
		System.out.println("frequency of"+arr[i]+"is"+count);
		// TODO Auto-generated method stub

	}
}
}