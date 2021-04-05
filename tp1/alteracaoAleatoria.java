package tp1;
import java.util.Random;

public class alteracaoAleatoria {
    public static void main(String[] args) {
        String read = MyIO.readLine();
        while(!read.equals("FIM")){
            System.out.println(aleatorio(read));
            read = MyIO.readLine();
        }

    }
    public static String aleatorio(String frase){
        Random gerador = new Random();
        gerador.setSeed(4);
        char a = 0;
        String novaFrase = "";
        a = (char) (Math.abs(gerador.nextInt())%26);
        char b = 0;
        b = (char) (Math.abs(gerador.nextInt())%26);
        for (int i = 0; i < frase.length(); i++){

            if(frase.charAt(i) == a){
                novaFrase = novaFrase + b;
            }else if(frase.charAt(i) == b){
                novaFrase = novaFrase + a;
            }else{
                novaFrase = novaFrase + frase.charAt(i);
            }
        }
        return novaFrase;
    }
}


