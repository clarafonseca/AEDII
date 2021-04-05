package com.pucminas.atividade_1;
import java.util.Arrays;
import java.util.Random;

public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

        Random gerador = new Random();
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 4; ++j) {
                matriz[i][j] = gerador.nextInt(1000);
            }
        }
        System.out.println(Arrays.deepToString(matriz));

        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int colunaMaior = 0;
        int linhaMaior = 0;
        int colunaMenor = 0;
        int linhaMenor = 0;
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 4; ++j) {
                if (matriz[i][j] >= maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }

                if (matriz[i][j] <= menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }
        System.out.println("O maior elemento da matriz informada é " + maior);
        System.out.println("Sua posição é: " + "[" +  linhaMaior  + ", " + colunaMaior + "]");
        System.out.println("O menor elemento da matriz informada é " + menor);
        System.out.println("Sua posição é: " + "[" +  linhaMenor + ", " + colunaMenor + "]");
    }
}