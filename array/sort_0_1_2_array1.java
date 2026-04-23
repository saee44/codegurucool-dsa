//sort array of 0s 1s 2s 
import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr[]={0,1,2,1,2,0,2,1,0};
		int zero=0;
		int one=0;
		int two=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				zero++;
			}
			else if(arr[i]==1){
				one++;
			}
			else{
				two++;
			}
		}
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.put(0,zero);
		map.put(1,one);
		map.put(2,two);
		
		int index=0;
		for(int i=0;i<=2;i++){
			int freq=map.get(i);
			while(freq!=0){
				arr[index]=i;
				index++;
				freq--;
			}
		}
		System.out.println(Arrays.toString(arr));		
	}


}