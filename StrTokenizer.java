import java.util.*;
class StrTokenizer{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String s1;
		System.out.println("Enter a string with spaces........");
		s1 = sc.nextLine();
		StringTokenizer s2 = new StringTokenizer(s1," ");
		while(s2.hasMoreTokens()){
			System.out.println(s2.nextToken());
		}
	}
} 