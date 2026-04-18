//To check if all elements are even
class Demo{
	public static void main(String[]args){
		int arr[]={1,2,3,4};
		int i=0;
		boolean ans=fun(arr,i);
		System.out.println(ans);

	}
	static boolean fun(int[]arr,int i){
		if(i==arr.length){
			return true;
		}

		if(arr[i]%2!=0){
			return false;
		}
		return fun(arr,i+1);

}

}
