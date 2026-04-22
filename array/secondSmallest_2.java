//find second smallest element

import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr[]={5,7,9,1,3,4,1,3};
		
		Arrays.sort(arr);
		int smallest=arr[0];
		int secsmallest=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=smallest){
				secsmallest=arr[i];
				break;
			}
		}
		System.out.println(secsmallest);
	}

}