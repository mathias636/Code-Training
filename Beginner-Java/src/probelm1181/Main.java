package probelm1181;
//

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int linha = scanner.nextInt();
        char operacao = scanner.next().charAt(0);
        System.out.println(OperacaoMatriz(linha, operacao));
        scanner.close();
    }

    private static double OperacaoMatriz(int linha, char operacao) {

        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[12][12];
        double result = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[linha].length; j++){
                matriz[i][j] = scanner.nextDouble();
            }
        }

        if(operacao == 'S'){
            result += soma(linha, matriz);
        }
        if(operacao == 'M'){
            result += media(linha, matriz);
        }

        scanner.close();
        return result;
    }

    private static double soma(int linha, double[][] matriz) {
        double result = 0;
        for(int i = 0; i < matriz[0].length; i++){
            result += matriz[linha][i];
        }
        return result;
    }

    private static double media(int linha, double[][] matriz) {
        double result = 0;
        for(int i = 0; i < matriz[0].length; i++){
            result += matriz[linha][i];
        }
        result = result / matriz[0].length;
        return result;
    }
}
