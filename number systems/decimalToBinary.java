class Demo{
	public static void main(String[]args){
		int num=1;
		int binary=0;
		int rev=1;
		while(num!=0){

			int bit=num%2;
			num=num/2;
			
			binary+=bit*rev;
			rev*=10;
		}
	System.out.println(binary);
	}

}