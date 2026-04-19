//find the largest element
class Demo{
	public static void main(String[]args){
		int arr[]={5,7,8,9,3,2,1};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max);

	}


}