class Demo{
	public static void main(String[]args){
		int n=5;
		int x;
		int y;
		
		for(int i=1;i<=2*n;i++){
			if(i<=n){
				x=n-i+1;
				y=i;
						
			}
			else{
				x=i-n;
				y=n-(i-n)+1;
		}
			for(int j=1;j<x;j++){
				System.out.print("_");
	
			}
			for(int j=1;j<=y;j++){
				System.out.print("*");
			}
			for(int j=1;j<y;j++){
				System.out.print("*");
			}
						System.out.println();

		}

	}

}