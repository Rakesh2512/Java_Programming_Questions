package Array;


class A{
	public static void display() {
		System.out.println("this is static method of class A");
	}
}
class B extends A{
	public static void display() {
		System.out.println("this is static method of class B");
	}
}

public class methodhidden {
	

	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new B();
		
		obj.display(); // call parents display
		obj1.display();// calls parent's display (not childs's because method hidding depends on the reference type
		
	}

}
