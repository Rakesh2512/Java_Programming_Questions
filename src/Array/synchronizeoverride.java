package Array;

class synchonized{
	public synchronized void show() {
		System.out.println("Thisis synchnized method of class A");
	}
}

class nonsyncronized extends synchonized{
	public void show() {
		System.out.println("This is non synchnozied method of class B");
	}
}

public class synchronizeoverride {

	public static void main(String[] args) {
		
		synchonized obj = new nonsyncronized();
		obj.show();

	}

}
