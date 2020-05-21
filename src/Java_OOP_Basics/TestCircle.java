package Java_OOP_Basics;

public class TestCircle {
	public static void main(String[] args) {
		var c1 = new Circle(2.0,"blue");
		c1.printData();
		
		System.out.println("=================");
		
		var c2 = new Circle(2.0);
		c2.printData();
		
		System.out.println("=================");
		
		var c3 = new Circle();
		c3.printData();
		
	}
}
