package problem1179;
//
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[15];
        int[] Npar = new int[5];
        int[] Nimpar = new int[5];

        for(int i = 0; i < 15; i++){
            N[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < N.length; i++){
            for(int j = 0; j < 5; j++){
                if(N[i] % 2 == 0){
                    Npar[j] = N[i];
                }else{
                    Nimpar[j] = N[i];
                }
            }
            for(int j = 0; j < Npar.length; j++){
                System.out.println("par["+j+"] = "+Npar[j]);
            }
            for(int j = 0; j < Nimpar.length; j++){
                System.out.println("impar"+"["+j+"] = "+Nimpar[j]);
            }
        }

        scanner.close();
    }
}
