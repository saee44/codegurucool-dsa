//print 1 to n
class Demo{
	static int count=1;
		static int n=10;

	public static void main(String[]args){
				Demo.fun();

	}
	static void fun(){
		if(count>n){
			return ;
		}
		System.out.println(count);
		count++;
		Demo.fun();
		
	}
}