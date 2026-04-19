//find the largest element
class Demo{
	public static void main(String[]args){
		int arr[]={5,7,8,9,3,2,1};
		int i=0;
		int max=maxElement(arr,i);
		System.out.println(max);

	}
	static int maxElement(int[]arr,int i){
			
		if(i==arr.length-1){
			return arr[i];

		}
		int max=maxElement(arr,i+1);
		if(arr[i]>max){
			return arr[i];
		}
		return max;
	}


}