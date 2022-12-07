import java.util.*;
import java.time.*;
class CheckTime{
	public static void main(String args[]){
		String t1,t2;
		LocalTime pt1,pt2,lt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first time intreval(HH:MM:SS): ");
		t1 = sc.next();
		pt1 = LocalTime.parse(t1);
		System.out.println("Enter second time intreval(HH:MM:SS): ");
		t2 = sc.next();
		pt2 = LocalTime.parse(t2);
		System.out.println("The first time interval......." + t1);
		System.out.println("The second time interval......." + t2);
		lt =LocalTime.now();
		System.out.println("The local time is......."+lt);
		if((lt.compareTo(pt1) >0) && (lt.compareTo(pt2) <0)){
			System.out.println("The Local time lies between the given Time Intervals");
		}else{
			System.out.println("The Local time does not lie between the given Time Interval");
		}
	}
}
		