class Demo{
	public static void main(String[]args){
		int a=20;
		int b=22;
		int i=1;
		int max=1;
		while(i<=a){
			if(a%i==0&&b%i==0){
				if(i>max){
					max=i;
				}
				//System.out.println(i);

			}
						i++;
		}
	System.out.println(max);

	}


}