//To count occurence of element
class Demo{
	public static void main(String[]args){
		int arr[]={2,2,3,2,4};
		int i=0;
		int target=2;
		int ans=fun(arr,i,target);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i,int target){
		int count=0;

	if(i==arr.length){
			return count;
		}

	if(arr[i]==target){
			count=1;
		}
		return count+fun(arr,i+1,target);

}

}
