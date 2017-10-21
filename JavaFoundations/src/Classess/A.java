package Classess;

public class A {

	public A(String A){
		System.out.println("Class A runs");
	}
}

class B extends A{
	public B(String hey){
		super("hey");
		System.out.println("Class B runs");
	}
}

class C extends B{
	public C (String s){
		super("hello");
		System.out.println("Class C runs");
	}
}