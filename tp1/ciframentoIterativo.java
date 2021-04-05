package com.pucminas.tp1;

public class ciframentoIterativo {
    public static void main(String[] args) {
        String read = MyIO.readLine();
        while(!read.equals("FIM")){
            System.out.println(criptografia(read));
            read = MyIO.readLine();
        }
    }

    public static String criptografia(String frase) {
        char caracter = 0;
        String novaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            caracter = (char) (frase.charAt(i) + 3);
            novaFrase = novaFrase + caracter;
        }

        return novaFrase;

    }
}
