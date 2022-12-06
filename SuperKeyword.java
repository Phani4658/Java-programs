/** Super keyword Program */

class Parent{
	Parent(int a ,int b){
		System.out.println("Super Class Parameters....");
		System.out.println("A Value: " + a);
		System.out.println("B Value: " + b);
	}
}
class Child extends Parent{
	Child(int x,int y){
		super(x,y);
		System.out.println("I am child class object");
	}
}
class SuperKeyword{
	public static void main(String args[]){
		Child obj = new Child(2,3);
	}
}

/**
Output:
Super Class Parameters....
A Value: 2
B Value: 3
I am child class object
*/

