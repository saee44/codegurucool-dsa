//find sum of digits of all elements
class Demo{
	public static void main(String[]args){
		int arr[]={12,34,5};
		int i=0;
		int ans=fun(arr,i);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i){
		int sum=0;
		if(i==arr.length){
			return sum;
		}
		int num=arr[i];
		while(num!=0){
			int digit=num%10;
			num=num/10;
			sum+=digit;
		}		
		return sum+fun(arr,i+1);
	}

}
