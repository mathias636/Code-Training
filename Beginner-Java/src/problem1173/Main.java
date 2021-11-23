package problem1173;
/*
Read a number and make a program which puts this number in the first position of an array N[10].
In each subsequent position, put the double of the previous position. 
For example, if the input number is 1, the array numbers ​​must be 1,2,4,8, and so on.

Input
The input contains an integer number V (V < 50).

Output
Print the stored number of each array position, in the form "N[i] = X", 
where i is the position of the array and x is the stored number at the position i. The first number for X is V.

Input Sample
1

Output Sample
N[0] = 1
N[1] = 2
N[2] = 4
...

Thanks to Cassio F.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V;
        int l = 10;
        int N[] = new int[l];
        do
        {
            V = input.nextInt();
        }while (V >= 50);
        for(int i = 0; i < l; i++){
            N[i] = V;
            System.out.println("N["+i+"] = "+V);
            V = V*2;
        }
        input.close();
    }
}
