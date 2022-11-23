import java.util.*;
class CalculateArea{
	int l,b,r
	void area(int r){
		this.r = r;
		System.out.println("Area of circle is : " +3.14*r*r);
	}
	void area(int l,int b){
		this.l = l;
		this.b = b;
		System.out.println("Area of rectangle is: " + l*b);
	}
}
class MethodOverloading{
	public static void main(String args[]){
		CalculateArea obj = new CalculateArea();
		Scanner sc = new Scanner(System.in);
		int ch,r,l,b;
		do{
			System.out.println("----------------MENU--------------------");
			System.out.println("1.Calculate Circle Area");
			System.out.println("2.Calculate Rectangle Area");
			System.out.println("3.Exit");
			System.out.println("----------------------------------------");
			System.out.print("Enter your choice...........");
			ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter radius of circle.........");
					int r = sc.nextInt();
					obj.area(r);
					break;
				case 2:
					System.out.print("Enter length of rectangle: ");
					int l = sc.nextInt();
					System.out.print("Enter breadth of rectangle: ");
					int b = sc.nextInt();
					obj.area(l,b);
					break;
				case 3:
					break;
			}
		}while(ch >= 1 && ch <=2);
	}
}					