class Demo{
	public static void main(String[]args){
		int n=36;
		int i=1;
		while(i*i<=n){
			if(n%i==0){
										System.out.println(i);
				if(i!=n/i){
				System.out.println(n/i);
				}

			}
			i++;
			
		}

	}

}