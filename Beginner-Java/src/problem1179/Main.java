package problem1179;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] vetor_par = new int[5];
        int[] vetor_impar = new int[5];
        int[] N = new int[15];
        int ji = 0;
        int jp = 0;

        //preenchimento vetor
        for(int i = 0; i < N.length; i++){
            N[i] = scanner.nextInt();
        }

        //condicionais de impressão e verificação
        for(int i = 0; i < 15; i++){

            if(N[i] % 2 == 0 || N[i] == 0){
                vetor_par[jp] = N[i];
                jp++;
            }else{
                vetor_impar[ji] = N[i];
                ji++;
            }

            if(jp == vetor_par.length){
                jp = 0;
                imprimir("par", vetor_par.length, vetor_par);
            }

            if(ji == vetor_impar.length){
                ji = 0;
                imprimir("impar", vetor_impar.length, vetor_impar);
            }
        }
        imprimir("impar", ji, vetor_impar);
        imprimir("par", jp, vetor_par);

        scanner.close();
    }

    private static void imprimir(String string, int tamanho, int vetor[]) {
        for(int i = 0; i < tamanho; i++){
            System.out.printf("%s[%d] = %d\n", string, i, vetor[i]);
        }
    }
}
