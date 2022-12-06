/** Simple Inheritance Java Program */
class Animal{
	void eat(){
		System.out.println("Animal is Eating");
	}
	void sleep(){
		System.out.println("Animal is Sleeping");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Dog is Barking");
	}
}
class Inheritance{
	public static void main(String args[]){
		Dog GermanShepard =  new Dog();
		GermanShepard.eat();
		GermanShepard.sleep();
		GermanShepard.bark();
	}
}



/**

Output:
Animal is Eating
Animal is Sleeping
Dog is Barking

*/
