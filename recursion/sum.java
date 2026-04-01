//1 to n sum
class Demo{
	static int i=1;
		static int n=100;
		static int sum=0;

	public static void main(String[]args){
				Demo.fun(i,n);

	}
	static void fun(int i,int n){
		if(i>n){
			System.out.println(sum);
			return ;
		}
		sum+=i;
		
		Demo.fun(i+1,n);
		
	}
}