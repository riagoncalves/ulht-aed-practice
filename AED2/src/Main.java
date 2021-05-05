public class Main {
    static long somarDo0AteN(int n) {
        if(n <= 0) {
            return 0;
        }
        return n + somarDo0AteN(n - 1);
    }

    static int quantasOrelhas(int nrCoelhos)  {
        if(nrCoelhos < 1) {
            return 0;
        }

        if(nrCoelhos == 1) {
            return 2;
        }

        return 2 + quantasOrelhas(nrCoelhos - 1);
    }

    static String gerarNumeros(int min, int max) {
        if (min == max) {
            return "" + min;
        }
        return "" + min + gerarNumeros(min + 1, max);
    }

    public static void main(String[] args) {
        System.out.println(somarDo0AteN(3));
    }
}
