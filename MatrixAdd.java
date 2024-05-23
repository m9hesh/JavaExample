package Anudip2504;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
		int b[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
		int res[][] = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				res[i][j] = a[i][j] + b[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
