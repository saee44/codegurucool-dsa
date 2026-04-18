//find min element
class Demo{
	public static void main(String[]args){
		int arr[]={2,9,1,7,9};
		int i=0;
		int ans=fun(arr,i);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i){
	if(i==arr.length-1){
			return arr[i];
		}

	int min=fun(arr,i+1);
	if(arr[i]<min){
		min=arr[i];
		return min;
	}
	return min;
	}

}
