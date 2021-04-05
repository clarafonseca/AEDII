package com.pucminas.atividade_1;
import java.util.Scanner;
import java.util.Arrays;

public class Prova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Gabarito: ");
        char[] gabarito = new char[8];
        for (int i = 0; i < 8; i++) {
            gabarito[i] = scanner.next().charAt(0);
        }
        System.out.println("Gabarito: " + Arrays.toString(gabarito));

        System.out.println("Quantos alunos existem: ");
        int alunos = scanner.nextInt();

        int aprovados = 0;

        for (int i = 0; i < alunos; i++){
            System.out.println("Digite as respostas do aluno " + (i + 1) + " :");

            int nota = 0;
            for (int z = 0; z < 8; z++) {
                char res = scanner.next().charAt(0);
                if (res == gabarito[z]) {
                    nota++;
                }
            }

            if (nota >= 5) {
                aprovados++;
            }

            System.out.println("Aluno " + (i + 1));
            System.out.println("Nota: " + nota);
        }
        double aprovacao = (aprovados * 1.0 / alunos) * 100.0;
        System.out.println("Porcentagem de aprovação: " + aprovacao + "%");
    }
}