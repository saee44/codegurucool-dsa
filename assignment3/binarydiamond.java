class Demo{
	public static void main(String[]args){
		int n=4;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<(n+1)-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if((i+j)%2==0)
				System.out.print(" "+"1");
				else
				System.out.print(" "+"0");
				a++;
		}
		System.out.println();


		
		}
		for(int i=n-1;i>0;i--){
			for(int j=1;j<(n+1)-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if((i+j)%2==0)
				System.out.print(" "+"1");
				else
				System.out.print(" "+"0");

				a++;

			}
			System.out.println();
		}

	}


}

/*
    1
   0 1
  1 0 1
 0 1 0 1
  1 0 1
   0 1
    1      */
