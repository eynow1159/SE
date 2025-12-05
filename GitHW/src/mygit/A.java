package mygit;

public class A {
	
	public void sayHello(String toWhom) {
		System.out.println("Hello! " + toWhom);
	}

	public void sayHi(String toWhom) {
		B b = new B();
		b.sayHi(toWhom);
	}
	
}
