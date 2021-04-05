package tp1;



public class IsInterativo {
    public static void main(String[] args) {
        String read = MyIO.readLine();
        while(!read.equals("FIM")){
            executa(read);
            read = MyIO.readLine();
        }
    }
    public static void executa(String frase){
        if(isVogal(frase) == "X1"){
            System.out.print("SIM ");
        }else System.out.print("NAO ");
        if(isConsoante(frase) == "X2"){
            System.out.print("SIM ");
        }else System.out.print("NAO ");
        if(isInteiro(frase) == "X3"){
            System.out.print("SIM ");
        }else System.out.print("NAO ");
        if(isReal(frase) == "X4"){
            System.out.print("SIM \n");
        }else System.out.print("NAO \n");
    }
    public static String isVogal(String frase) {
        String X1 = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.toLowerCase().charAt(i)) {
                case 'a':
                    X1 = "X1";
                    break;
                case 'e':
                    X1 = "X1";
                    break;
                case 'i':
                    X1 = "X1";
                    break;
                case 'o':
                    X1 = "X1";
                    break;
                case 'u':
                    X1 = "X1";
                    break;
                default:
                    return "";
            }
        }
        return X1;
    }
    public static String isConsoante(String frase) {
        String X1 = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.toLowerCase().charAt(i)) {
                case 'a':
                    return "";
                case 'e':
                    return "";
                case 'i':
                    return "";
                case 'o':
                    return "";
                case 'u':
                    return "";
                default:
                    if(frase.charAt(i) >= 48 && frase.charAt(i) <= 57){
                        return "";
                    }
                    X1 = "X2";
                    break;
            }
        }
        return X1;
    }
    public static String isInteiro(String frase) {
        String X1 = "";
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= 48 && frase.charAt(i) <= 57){
                X1 = "X3";
            }
            else{
                return "";
            }
        }
        return X1;
    }
    public static String isReal(String frase) {
        String X1 = "";
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= 48 && frase.charAt(i) <= 57){
                X1 = "X4";
            }else if(frase.charAt(i) == ','){
                X1 = "X4";
            }
            else{
                return "";
            }
        }
        return X1;
    }
}

