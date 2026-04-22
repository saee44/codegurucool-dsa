//find second smallest element
import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr[]={5,7,9,1,3,4,1,3};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int freq[]=new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;

		}
		int k=0; 
		int secsmallest=0;
		for(int i=0;i<freq.length;i++){
			if(freq[i]>0){
				k++;
			}
			if(k==2){
				secsmallest=i;
				break;
			}
		}
		System.out.println(secsmallest);
	}


}