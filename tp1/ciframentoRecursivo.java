
public class CiframentoRecursivo {


    public static void main(String[] args) {
        String read = myIO.readLine();
        while(!read.equals("FIM")){
            System.out.println(executa(read));
            read = myIO.readLine();
        }

    }
    public static String executa(String frase){
        return criptografia(frase, 0, "");
    }

    public static String criptografia(String frase, int i, String novaFrase) {
        char caracter = 0;
        if(i < frase.length()){
            caracter = (char) (frase.charAt(i) + 3);
            novaFrase = novaFrase + caracter;
            return criptografia(frase, i + 1, novaFrase);
        }
        else{
            return novaFrase;
        }

    }

}
