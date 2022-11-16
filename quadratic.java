import javax.swing.JOptionPane;
import java.lang.Math;
class quadratic{
	public static void main(String args[]){
		String x2_coefficient = JOptionPane.showInputDialog("Enter coefficient of x2");
		int a  = Integer.parseInt(x2_coefficient);
		String x_coefficient = JOptionPane.showInputDialog("Enter coefficient of x");
		int b  = Integer.parseInt(x_coefficient);
		String constant_coefficient  = JOptionPane.showInputDialog("Enter coefficient of constant");
		int c  = Integer.parseInt(constant_coefficient);
		int discriminate = (b *b - 4 * a * c);
		if(discriminate < 0){
			System.out.println("Imaginary Roots");
		}
		else if(discriminate == 0){
			System.out.println("Only single root: ");
			int root = -b/(2*a);
			System.out.println(root + " is root of given expression");
		}
		else{
			double root1 = (-b - Math.sqrt(discriminate)) /2*a;
			double root2 = (-b + Math.sqrt(discriminate)) /2*a;
			System.out.println("The expression has 2 roots they are: " + root1 + root2);
		}
	}
}

/** Write a java program to find prime numbers between 1 to n */
