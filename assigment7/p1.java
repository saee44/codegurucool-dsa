//To find the first occurence of element
class Demo{
	public static void main(String[]args){
		int arr[]={2,2,3,2,4};
		int i=0;
		int target=2;
		int ans=fun(arr,i,target);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i,int target){
	if(i==arr.length){
			return -1;
		}

	if(arr[i]==target){
			return i;
		}
		return fun(arr,i+1,target);

}

}
