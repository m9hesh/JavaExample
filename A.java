package Anudip2105;

public class A {
	String fruit = "Apple 100";
	A(){
		System.out.println("A's Constuctor");
	}
}
class B extends A{
	String fruit = "Apple 200";
	B(){
		System.out.println("B's Constructor");
	}
	void disc() {
		System.out.println(super.fruit +" Fruit in class A");
		System.out.println(fruit +" Fruit in class B");
	
	}
	public static void main(String[] args) {
		B obj = new B();
	
		obj.disc();
		
	}
}
