/** Multilevel Inheritance Program */

class Human{
	void displayHuman(){
		System.out.println("I am a Human");
	}
}
class Student extends Human{
	void display(){
		System.out.println("I am a Student once..");
	}
}
class WorkingProfessional extends Student{
	void print(){
		System.out.println("I am a working professional now");
	}
}

class MultiLevelInheritance{
	public static void main(String args[]){
		WorkingProfessional person = new WorkingProfessional();
		person.displayHuman();
		person.display();
		person.print();
	}
}


/**
Output:
I am a Human
I am a Student once..
I am a working professional now
*/
