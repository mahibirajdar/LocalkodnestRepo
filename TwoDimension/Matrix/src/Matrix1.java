
public class Matrix1 {

	public static void main(String[] args) {
		System.out.println("enter array elements....");
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("exchange diagonal elements.....");
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
	}
		System.out.println("after exchanging diagonal..... ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
}
	}
}