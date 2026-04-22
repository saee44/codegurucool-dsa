//find second largest element


class Demo{
	public static void main(String[]args){
		int arr[]={5,7,9,1,3,4,1,3};
		int largest=arr[0];
		int seclargest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				seclargest=largest;
				largest=arr[i];
			}			
		}
		System.out.println(seclargest);
	}

}