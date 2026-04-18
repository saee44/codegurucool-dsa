//find index of smallest element 
class Demo{
	public static void main(String[]args){
		int arr[]={5,2,6,7};
		int i=0;
		int ans=fun(arr,i);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i){
		if(i==arr.length-1){
			return i;
		}

		int smallest=fun(arr,i+1);
		if(arr[i]<arr[smallest]){
			smallest=i;
		}
		return smallest;		
	}

}
