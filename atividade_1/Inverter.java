package com.pucminas.atividade_1;
import java.util.Scanner;

public class Inverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma frase:");

        String frase = scanner.nextLine();
        System.out.println(frase);

        int tam = frase.length();
        for (int i = tam - 1; i >= 0; --i) {
            System.out.print(frase.charAt(i));
        }
    }
}
