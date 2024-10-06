package Array;


class Parent{
	public void show() {
		System.out.println("This is show of class Parent");
	}
}
class Child extends Parent{
	public void show() {
		System.out.println("this is show of class Child");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.show();
		
		Parent obj1 = new Child();
		
		obj1.show();

	}

}
