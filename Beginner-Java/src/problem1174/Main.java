package problem1174;

import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
		double[] A = new double[100];
		Scanner scanner = new Scanner(System.in);


		for(int i = 0; i < A.length; i++){
			A[i] = scanner.nextDouble();
		}

		for(int i = 0; i < A.length; i++){
			if(A[i] <= 10){
				System.out.println("A["+i+"] = "+A[i]);
			}
		}

		scanner.close();
	}
}
