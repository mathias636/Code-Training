package problem1173;
//
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        boolean shallpass = false;
        int[] N = new int[10];
        int V = 0;

        while(shallpass == false){
            V = scanner.nextInt();
            if(V <= 50){
                shallpass = true;
            }
        }
        
        for(int i = 0; i < N.length; i++){
            if(i == 0){
                N[i] = V;
            }else{
                N[i] = N[i-1] * 2;
            }
            System.out.println("N["+i+"] = "+N[i]);
        }

        scanner.close();
    }
}
