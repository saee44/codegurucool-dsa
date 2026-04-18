//check palindrom array
class Demo{
	public static void main(String[]args){
		int arr[]={1,2,3,2,7,1};
		int i=0;
		boolean ans=fun(arr,i);
		System.out.println(ans);

	}
	static boolean fun(int[]arr,int i){
		if(i==arr.length/2){
			return true;
		}
		if(arr[i]!=arr[(arr.length-1)-i]){
			return false;
		}

		return fun(arr,i+1);

	}

}
