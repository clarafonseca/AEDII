package tp1;

public class palindromoIterativo {
    public static void main(String[] args) {
        String scan = MyIO.readLine();
        while (!scan.equals("FIM")){
            if(palindromo(scan)){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }
            scan = MyIO.readLine();
        }

    }
    public static String reverse(String frase){
        String reverse = "";
        for (int i = frase.length()-1 ; i >= 0 ; i--){
            reverse = reverse + frase.charAt(i);
        }
        return reverse;
    }
    public static Boolean palindromo(String frase){
        if(frase.equals(reverse(frase))){
            return true;
        }
        return false;
    }
}