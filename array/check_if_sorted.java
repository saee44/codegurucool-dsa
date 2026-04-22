//check if array is sorted


class Demo{
	public static void main(String[]args){
		int arr[]={1,2,3,4};
		Boolean check=true;		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
					check=false;
					break;			
				}			
		}
		System.out.println(check);
	}

}