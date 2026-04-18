//sum of all negative numbers
class Demo{
	public static void main(String[]args){
		int arr[]={-1,-2,3,-4};
		int i=0;
		int ans=fun(arr,i);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i){
		int sum=0;
		if(i==arr.length){
			return sum;
		}

		if(arr[i]<0){
			sum=arr[i];
		}
		return sum+fun(arr,i+1);
	}

}
