package Array;

abstract class drawing{
	public abstract void circle();
	
	public void square() {
		System.out.println("square drawing");
	}
	
}
public class AbstractClass extends drawing {

	public static void main(String[] args) {
		
		AbstractClass obj = new AbstractClass();
		obj.circle();
		obj.square();
	}

	@Override
	public void circle() {
		System.out.println("This is circle method");
		
	}

}
