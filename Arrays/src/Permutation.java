
public class Permutation {

	public static void main(String[] args) {
		int nums[]={0,2,1,5,3,4};
		int ans[]=new int[nums.length];
		for(int i=0;i<=nums.length-1;i++){
			ans[i]=nums[nums[i]];
		}
		for(int i=0;i<=nums.length-1;i++){
			System.out.print(ans[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
