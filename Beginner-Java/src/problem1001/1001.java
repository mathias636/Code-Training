import java.util.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner (System.in);
		int A;
		int B;
		int X;
		A = scanner.nextInt();
		B = scanner.nextInt();
		X = A + B;
		System.out.println("X = "+X);
	}
}
