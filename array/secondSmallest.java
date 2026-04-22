//find second smallest element

class Demo{
	public static void main(String[]args){
		int arr[]={5,7,9,1,3,4,1,3};
		int smallest=arr[0];
		int secsmallest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallest){
				secsmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]>smallest&&arr[i]<secsmallest){
				secsmallest=arr[i];
			}
		}
		System.out.println(secsmallest);
	}

}