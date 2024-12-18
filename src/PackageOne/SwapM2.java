package PackageOne;

public class SwapM2 {

	public static void main(String[] args) {
		int a=50;
		int b=20;
		System.out.println("before swap number a is "+a+" and b is"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap number a is "+a+" and b is"+b);

	}

}
