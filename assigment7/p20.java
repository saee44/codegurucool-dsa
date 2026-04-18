//check if array is strictly decrasing
class Demo{
	public static void main(String[]args){
		int arr[]={-1,-2,3,-4};
		int i=0;
		boolean ans=fun(arr,i);
		System.out.println(ans);

	}
	static boolean fun(int[]arr,int i){
		
		if(i==arr.length-1){
			return true;
		}

		if(arr[i]<arr[i+1]){
			return false;
		}
		return fun(arr,i+1);
	}

}
