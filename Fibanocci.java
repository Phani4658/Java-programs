import java.util.*;
class Fibanocci{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		n = sc.nextInt();
		System.out.println("The " + n + "Terms of Fibanocci series are  ");
		for(int i =0;i < n;i++){
			System.out.print(fib(i) + " ");
		}
	}
	public static int fib(int n){
		if (n <=1)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
} 