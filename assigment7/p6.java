//To check if any element is even
class Demo{
	public static void main(String[]args){
		int arr[]={1,2,-3,4};
		int i=0;
		boolean ans=fun(arr,i);
		System.out.println(ans);

	}
	static boolean fun(int[]arr,int i){
	if(i==arr.length){
			return false;
		}

	if(arr[i]<0){
			return true;
		}
		return fun(arr,i+1);

}

}
