//elements greater than x;
class Demo{
	public static void main(String[]args){
		int arr[]={10,20,40,1};
		int i=0;
		int x=3;
		int ans=fun(arr,i,x);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i,int x){
		int count=0;
		if(i==arr.length){
			return count;
		}

		if(arr[i]>x){
			count=1;
		}
		return count+fun(arr,i+1,x);
	}

}
