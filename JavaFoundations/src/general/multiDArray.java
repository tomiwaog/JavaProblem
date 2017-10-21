package general;

import java.util.Scanner;

public class multiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][];
		
		arr[0]= new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		sc.close();
		//Scan input into 2D array
		for (int i=0; i< arr.length;i++){
			for (int j=0; j<arr[i].length; j++){
				System.out.print("enter el for column "+j+ " of row "+ i + ": ");
				arr[i][j]= sc.nextInt();
			}
			System.out.println("\n");
		}
		
		for (int[] x : arr){
			for (int y : x)
				System.out.print(y+ " ");
		}
		
	}

}
