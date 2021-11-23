package problem1172;
/*
    problem 1172 URI

    Read an array X[10]. After, replace every null or negative number of X ​by 1. Print all numbers stored in the array X.

    Input
    The input contains 10 integer numbers. These numbers ​​can be positive or negative.

    Output
    For each position of the array, print "X [i] = x", where i is the position of the array and x is the number stored in that position.

    Input Sample
    0
    -5
    63
    0
    ...

    Output Sample
    
    X[0] = 1
    X[1] = 1
    X[2] = 63
    X[3] = 1
    ...

    Thanks to Cassio F.
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int l = 10;
        int X[] = new int[l];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < l; i++){
            X[i] = scanner.nextInt();
            if(X[i] == 0 || X[i] < 0){
                X[i] = 1;
            }
        }
        for(int i = 0; i < l; i++){
            System.out.println("X["+i+"] = "+X[i]);
        }
        scanner.close();
    }
}