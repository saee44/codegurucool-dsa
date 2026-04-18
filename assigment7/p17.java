//count elements divisible by k
class Demo{
	public static void main(String[]args){
		int arr[]={2,4,5,6,9};
		int i=0;
		int k=2;
		int count=fun(arr,i,k);
		System.out.println(count);

	}
	static int fun(int[]arr,int i,int k){
		int count=0;
		if(i==arr.length){
			return count;
		}

		if(arr[i]%k==0){
			count=1;
		}
		return count+fun(arr,i+1,k);
	}

}
