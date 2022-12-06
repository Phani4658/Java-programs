import java.util.*;
class matrixMul{
	public static void main(String args[]){
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows of array 1....");
		a = sc.nextInt();
		System.out.print("Enter no of columns of array 1....");
		b = sc.nextInt();
		int[][] arr1 = new int[a][b];
		for(int i = 0;i < a;i++){
			for(int j=0;j<b;j++){
				System.out.println("Enter element in " + i + " row  and " + j +" Column");
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array 1 is " );
		for(int i = 0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Enter no of rows of array 2....");
		c = sc.nextInt();
		System.out.print("Enter no of columns of array 2....");
		d = sc.nextInt();
		int[][] arr2 = new int[c][d];
		for(int i = 0;i < c;i++){
			for(int j=0;j<d;j++){
				System.out.println("Enter element in " + i + " row  and " + j +" Column");
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array 2 is " );
		for(int i = 0;i<c;i++){
			for(int j=0;j<d;j++){
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		if(b == c){
			int[][] result = new int[a][d];
			for(int i=0;i<a;i++){
				for(int j=0;j<d;j++){
					result[i][j] = 0;
					for(int k=0;k<b;k++){
						result[i][j] += arr1[i][k]*arr2[k][j];
					}
				}
			}
			System.out.println("Multiplied Array:  ");
			for(int i=0;i<a;i++){
				for(int j=0;j<d;j++){
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Multiplication not possible ");
		}
	}
}
