import java.util.*;
class RemoveDuplicate{
	public static void main(String args[]){
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int a,i=0;
		boolean check =false;
		while(i<5){
			System.out.print("Enter "+(i+1) + " Element....."); 
			a = sc.nextInt();
			if(a > 10 && a<100){
				for(int j=0;j<arr.length;j++){
					check = (arr[j] == a);
					if(check == true){
						break;
					}
				}
				if(check){
					System.out.println("Duplicate Element found");	
				}
				else{
					arr[i] =a;
					i++;
				}
			}
			else{
				System.out.println("Enter number between 10 and 100");
			}
		}
		for(i=0;i<5;i++){
			System.out.print( arr[i] + " ");
		}
	}
}
			