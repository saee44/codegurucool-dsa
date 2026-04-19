import java.util.*;
class Demo{
	public static void main(String[]args){
			int arr[]={0,3,1,5,6,7};
			int element=0;
			for(int i=1;i<arr.length;i++){
				int temp=arr[i];
				arr[i]=arr[element];
				arr[element]=temp;
				element=i;
			}
			System.out.println(Arrays.toString(arr));

		}

}