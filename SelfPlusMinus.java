public class SelfPlusMinus{
	public static void main(String[] args) {
		int a = 3;
		int b = a++;
		int c = b++;
		int d = 3;
		int e = --d;
		int f = --e;
		System.out.println("The increased value is " + b);	
		System.out.println("The increased value is " + c);
		System.out.println("The decreased value is " + e);
		System.out.println("The decreased value is " + f);
	}
}