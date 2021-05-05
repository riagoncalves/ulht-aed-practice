public class Main {

    static int contarOcorrencias(String str, char c, int pos) {
        if(str == null || pos == str.length()) {
            return 0;
        }

        if(str.charAt(pos) == c) {
            return 1 + contarOcorrencias(str, c, pos + 1);
        }
        else {
            return 0 + contarOcorrencias(str, c, pos + 1);
        }
    }

    static int contarOcorrencias2(String str, char c) {
        if(str.length() == 0) {
            return 0;
        }

        String subStr = str.substring(1, str.length());

        if(str.charAt(0) == c) {
            return 1 + contarOcorrencias2(subStr, c);
        }
        else {
            return 0 + contarOcorrencias2(subStr, c);
        }
    }

    static String removeChar(String str, char c) {
        if(str.length() == 0) {
            return "";
        }

        String subStr = str.substring(1, str.length());

        if(str.charAt(0) == c) {
            return "" + removeChar(subStr, c);
        }
        else {
            return str.charAt(0) + removeChar(subStr, c);
        }
    }

    static String inverterString(String str) {
        if(str.length() == 0) {
            return "";
        }

        String subStr = str.substring(0, str.length() - 1);

        return str.charAt(str.length() - 1) + inverterString(subStr);
    }

    public static void main(String[] args) {

    }
}
