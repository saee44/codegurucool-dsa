//To find the Last occurence of element
class Demo{
	public static void main(String[]args){
		int arr[]={2,2,3,2,4};
		int i=0;
		int target=2;
		int ans=fun(arr,i,target);
		System.out.println(ans);

	}
	static int fun(int[]arr,int i,int target){
	if(i==arr.length){
			return -1;
		}

	int index=fun(arr,i+1,target);
	if(index!=-1)return index;
	if(arr[i]==target){
			return i;
		}
	return index;

}

}
