
import java.util.*;
class student{
	String name,rollNo;
	public void readDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student Name .....");
		name = sc.next();
		System.out.print("Enter Roll no.....");
		rollNo = sc.next();
	}
	public void displayDetails(){
		System.out.println("Student name..........." + name);
		System.out.println("Student details.........." + rollNo);
	}
}
class test extends student{
	int m,p,c;
	public void readMarks(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter maths marks .....");
		m = sc.nextInt();
		System.out.print("Enter physics marks.....");
		p = sc.nextInt();
		System.out.print("Enter chemistry marks.....");
		c = sc.nextInt();
	}
	public void displayMarks(){
		System.out.println("Maths marks ....." + m);
		System.out.println("Physics marks....." + p);
		System.out.println("Chemistry marks....." + c);
	}
}
class Inheritance{
	public static void main(String args[]){
		test t = new test();
		t.readDetails();
		t.displayDetails();
		t.readMarks();
		t.displayMarks();
	}
}
	
		
		