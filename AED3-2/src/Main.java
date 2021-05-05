import java.util.Arrays;

public class Main {
    static int somarElementos(int[] numeros, int pos) {
        if(numeros == null || pos == numeros.length) {
            return 0;
        }

        return numeros[pos] + somarElementos(numeros, pos + 1);
    }

    static int maiorElemento(int[] numeros, int pos){
        if(numeros == null || numeros.length == 0) {
            return 0;
        }

        if(pos == numeros.length - 1) {
            return numeros[pos];
        }
        else {
            int nextElement = maiorElemento(numeros, pos + 1);

            if(numeros[pos] > nextElement) {
                return numeros[pos];
            }
            else {
                return nextElement;
            }
        }


    }

    static int somarElementos2(int[] numeros) {
        if(numeros == null || numeros.length == 0) {
            return 0;
        }
        int[] subArr = Arrays.copyOfRange(numeros, 1, numeros.length);
        return numeros[0] + somarElementos2(subArr);
    }

    public static void main(String[] args) {
    }
}
