//check if array contains target
class Demo{
	public static void main(String[]args){
		int arr[]={10,30,40,4};
		int i=0;
		int target=30;
		boolean ans=fun(arr,i,target);
		System.out.println(ans);

	}
	static boolean fun(int[]arr,int i,int target){
		
		if(i==arr.length){
			return false;
		}

		if(arr[i]==target){
			return true;
		}
		return fun(arr,i+1,target);
	}

}
