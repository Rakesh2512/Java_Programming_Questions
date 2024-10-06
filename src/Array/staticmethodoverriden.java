package Array;


class father{
	public static void staticmethod() {
		
		System.out.println("this is staticmethod of class parent");
	}
	public void show() {
		System.out.println("this is method of class parent");
	}
}

class children extends father{
	
	public static void staticmethod() {
		
		System.out.println("this is staticmethod of class child");
	}
	
	public void show() {
		System.out.println("this is method of class child");
	}
}

public class staticmethodoverriden {

	
	public static void main(String[] args) {
		
		father f = new father();
		children c = new children();
		
		f.staticmethod();
		f.show();
		
		c.staticmethod();
		c.show();

		father ff = new children();
		ff.staticmethod();
	}

}
