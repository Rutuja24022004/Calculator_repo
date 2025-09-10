package overriding;

public class Test {
	
	public void m1(A a)
	{
		System.out.println("m1--A");
	}
	public void m1(B b)
	{
		System.out.println("m1--B");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(null);
	}

}
