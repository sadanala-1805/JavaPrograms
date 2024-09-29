import java.util.*;
abstract class Shape{
	
	int num1,num2;
	public abstract void printArea();
	
}

class Rectangle extends Shape{
	
	Rectangle(int length,int breadth){
		this.num1 = length;
		this.num2 = breadth;
	}

	@Override
	public void printArea() {
		double area = num1 * num2;
		System.out.println("Area of the rectangle : " + area);
		
	}
	
}

class Circle extends Shape{
	Circle(int radius){
		this.num1 = radius;
	}
	
	@Override
	public void printArea() {
		double area = 2 * 3.14 * num1;
		System.out.println("Area of the circle : "+ area);
		
	}
}

class Triangle extends Shape{
	Triangle(int base, int height){
		this.num1 = base;
		this.num2 = height;
	}

	@Override
	public void printArea() {
			double area = 0.5 * num1 * num2;
			System.out.println("Area of the Triangle : " + area);
	}
}


public class Shapes8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length and bredth of the rectangle : ");
		int len = sc.nextInt();
		int breadth = sc.nextInt();
		Rectangle rect = new Rectangle(len,breadth);
		rect.printArea();
		
		System.out.println("Enter the radius of the circle : ");
		int rad = sc.nextInt();
		Circle circle = new Circle(rad);
		circle.printArea();
		
		System.out.println("Enter the base and heigth of the triangle : ");
		int base = sc.nextInt();
		int height = sc.nextInt();
		Triangle tri = new Triangle(base,height);
		tri.printArea();
		
		
		
		sc.close();
	}

}
