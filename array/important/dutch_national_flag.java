import java.util.*;
//sort arrays of 0s 1s 2s using dutch national flag algorithm
class Demo{
	public static void main(String[]args){
		int arr[]={0,1,2,1,2,0,0,1,2};
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high){
			if(arr[mid]==0){
				swap(arr,mid,low);
				mid++;
				low++;
			}
			else if(arr[mid]==1){
				mid++;
			}
			else{
				swap(arr,mid,high);
				high--;
				mid++;
					
				
			}
		}
		System.out.println(Arrays.toString(arr));	
		
	}
	public static void swap(int[]arr,int num1,int num2){
			int temp=arr[num1];
			arr[num1]=arr[num2];
			arr[num2]=temp;
		}


}