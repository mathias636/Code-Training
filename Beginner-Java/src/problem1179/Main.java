import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[15];
        int[] vetor_par = new int[5];
        int[] vetor_impar = new int[5];
        int ji = 0;
        int jp = 0;
        int aux = 0;


        //entrada de valores
        for(int i = 0; i < N.length; i++){
            N[i] = scanner.nextInt();
        }
        
        //percorrer N[] e Condicionais de Impressão
        for(int i = 0; i < N.length; i++){

            if(jp > 0){
                if(jp == vetor_par.length){
                    imprimir(vetor_par, "par", jp);
                    jp = 0;
                }
                if(i == N.length-1){
                    imprimir(vetor_par, "par", jp);
                }                
            }

            //impar
            if(ji > 0 && aux != ji){
                imprimir(vetor_impar, "impar", ji);
                aux++;
                if(ji == vetor_impar.length){
                    ji = 0;
                    aux = 0;
                }
            }            

            //condicionais de verificação
            if(N[i] % 2 == 0 || N[i] == 0){
                vetor_par[jp] = N[i];
                jp++;
            }else{
                vetor_impar[ji] = N[i];
                ji++;
            }
            
        }
        scanner.close();
    }

    private static void imprimir(int[] vetor, String string, int tamanho) {
        for(int i = 0; i < tamanho; i++){
            System.out.printf("%s[%d] = %d\n", string, i, vetor[i]);
        }
    }
}
