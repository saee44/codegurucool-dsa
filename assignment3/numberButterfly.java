class Demo{
	public static void main(String[]args){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int j=1;j<=(n*2)-(i*2);j++){
				System.out.print(" ");

			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int j=1;j<=(n*2)-(i*2);j++){
				System.out.print(" ");

			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}

		

	}

}
/*

1      1
12    21
123  321
12344321
12344321
123  321
12    21
1      1    */