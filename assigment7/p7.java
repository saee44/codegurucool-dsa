//find maximum element
class Demo{
	public static void main(String[]args){
		int arr[]={2,9,1,700};
		int i=0;
		int ans=fun(arr,i);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i){
	if(i==arr.length){
			return -1;
		}

	int max=fun(arr,i+1);
	if(arr[i]>max){
		max=arr[i];
		return max;
	}
	return max;
	}

}
