import java.util.*;

abstract class Shape{
	int l,b,r;
	abstract public void area();
}
class Rectangle extends Shape{
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of rectangle: ");
		l = sc.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		b = sc.nextInt();
	}
	public void area(){
		System.out.println("Length of rectangle : " + l);
		System.out.println("Breadth of rectangle: " + b);
		System.out.println("The area of rectangle is "  + (l*b));
	}
}
class Circle extends Shape{
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius of circle: ");
		r = sc.nextInt();
	}
	public void area(){
		System.out.println("Radius of circle: " + r);
		System.out.println("Area of circle : " + (r*r));
	}
}
class AbstractClass{
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		r.accept();
		r.area();
		c.accept();
		c.area();
	}
}
