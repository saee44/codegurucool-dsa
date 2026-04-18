//sum of elements at odd index
class Demo{
	public static void main(String[]args){
		int arr[]={10,30,40,4};
		int i=0;
		int ans=fun(arr,i);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i){
		int sum=0;
		if(i==arr.length){
			return sum;
		}

		if(i%2!=0){
			sum=arr[i];
		}
		return sum+fun(arr,i+1);
	}

}
