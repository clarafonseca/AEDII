package tp1;



public class IsRecursivo {
    public static void main(String[] args) {
        String read = MyIO.readLine();
        while (!read.equals("FIM")) {
            executa(read);
            read = MyIO.readLine();
        }
    }

    public static void executa(String frase) {
        if (isVogal(frase, 0, "") == "X1") {
            System.out.print("SIM ");
        } else System.out.print("NAO ");
        if (isConsoante(frase, 0, "") == "X2") {
            System.out.print("SIM ");
        } else System.out.print("NAO ");
        if (isInteiro(frase, 0, "") == "X3") {
            System.out.print("SIM ");
        } else System.out.print("NAO ");
        if (isReal(frase, 0, "") == "X4") {
            System.out.print("SIM \n");
        } else System.out.print("NAO \n");
    }

    public static String isVogal(String frase, int i, String X1) {
        if (i < frase.length()) {
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
            return isVogal(frase, i + 1, X1);
        } else {
            return X1;
        }
    }

    public static String isConsoante(String frase, int i, String X2) {

        if (i < frase.length()) {
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
                    if (frase.charAt(i) >= 48 && frase.charAt(i) <= 57) {
                        return "";
                    }
                    X2 = "X2";
                    break;
            }
            return isConsoante(frase, i + 1, X2);
        } else {
            return X2;
        }
    }

    public static String isInteiro(String frase, int i, String X3) {

        if (i < frase.length()) {
            if (frase.charAt(i) >= 48 && frase.charAt(i) <= 57) {
                X3 = "X3";
            } else {
                return "";
            }
            return isInteiro(frase, i + 1, X3);
        } else {
            return X3;
        }
    }

    public static String isReal(String frase, int i, String X4) {

        if (i < frase.length()) {
            if (frase.charAt(i) >= 48 && frase.charAt(i) <= 57) {
                X4 = "X4";
            } else if (frase.charAt(i) == ',') {
                X4 = "X4";
            } else {
                return "";
            }
            return isReal(frase, i + 1, X4);
        } else {
            return X4;
        }
    }
}
