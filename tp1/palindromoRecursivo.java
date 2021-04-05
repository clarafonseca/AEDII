package tp1;


public class palindromoRecursivo {
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
    public static String reverse(String frase, int i, String reverse){
        if(i >=0){
            reverse = reverse + frase.charAt(i);
            return reverse(frase, i-1, reverse);
        }
        else {
            return reverse;
        }
    }
    public static Boolean palindromo(String frase){
        if(frase.equals(reverse(frase, frase.length()-1,""))){
            return true;
        }
        return false;
    }
}
