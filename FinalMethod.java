class Intial{
	final void display(){
		System.out.println("This is final method");
	}
} 
class Final extends Intial{
	final void display(){
		System.out.println("Final method is overridden");
	}
}
class FinalMethod{
	public static void main(String args[]){
		Final obj = new Final();
		obj.display();
	}
}