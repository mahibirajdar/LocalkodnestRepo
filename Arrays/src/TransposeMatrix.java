
public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= new int[3][3];
		for(int i=0;i<=a.length-1;i++){
			for(int j=0;j<=a.length-1;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("rotate to 90 degree clockwise....");
		for(int i=0;i<=a.length-1;i++){
			for(int j=0;j<=a.length-1;j++){
			b[j][a.length-i-1]=a[i][j];	
			}
		}
		System.out.println("after rotation.......");
		for(int i=0;i<=a.length-1;i++){
			for(int j=0;j<=a.length-1;j++){
				System.out.print(b[i][j]+" ");
			}
		// TODO Auto-generated method stub
System.out.println();
	}
	}
}
