
public class IndexValue {

	public static void main(String[] args) {
		int target=9;
		int a[] ={2,7,11,15};
		for(int i=0;i<=a.length-1;i++){
			for(int j=1;j<=a.length-1;j++){
				if(a[i]+a[j]==target){
					System.out.println(i+" "+j);
					break;
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
