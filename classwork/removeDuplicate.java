import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr[]={1,3,2,1,2,3,4};
		for(int i=0;i<arr.length;i++){
			boolean check=false;
			for(int x=0;x<i;x++){
				if(arr[x]==arr[i])
				check=true;
			}
			if(check)continue;
			int minindex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minindex]&&arr[j]>=0){
						int temp = arr[minindex];
arr[minindex] = arr[j];
arr[j] = temp;
					}
				else if(arr[j]==arr[minindex]){
					arr[j]=-1;
				}
			}
			arr[i]=arr[minindex];
		}
		System.out.println(Arrays.toString(arr));

	}


}