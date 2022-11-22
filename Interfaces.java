import java.util.*;
interface shape{
	public void accept();
	public void area();
}
class Square implements shape{
	int side;
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side of square: ");
		side = sc.nextInt();
	}
	public void area(){
		System.out.println("Side of square: " + side);
		System.out.println("Area of square: " + side * side);
	}
}
class Rectangle implements shape{
	int l,b;
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle: " );
		l = sc.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		b = sc.nextInt();
	}
	public void area(){
		System.out.println("length of rectangle: " + l);
		System.out.println("breadth of rectangle: "+ b);
		System.out.println("Area of rectangle: " + l*b);
	}
}
class Interfaces{
	public static void main(String args[]){
		Square s = new Square();
		Rectangle r = new Rectangle();
		s.accept();
		s.area();
		r.accept();
		r.area();
	}
}
