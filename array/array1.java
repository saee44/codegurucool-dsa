
import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr[]={5,7,8,9,3,2,1};
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);

			
		}
		int max=Collections.max(map.keySet());a
		System.out.println(max);
				
	}


}