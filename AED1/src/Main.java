import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá");
    }

    static long soma(int num1, int num2) {
        return num1 + num2;
    }

    static long soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static String concatena(int num1, int num2) {
        return num1 + " " + num2;
    }

    static int[] criaArray() {
        return new int[5];
    }

    static void preencheArray(int[] numeros) {
        numeros[0] = 4;
        numeros[1] = 9;
        numeros[2] = 9;
        numeros[3] = 7;
    }

    static String converteParaString(int[] numeros) {
        return Arrays.toString(numeros);
    }

    static long soma(int[] numeros) {
        if(numeros == null || numeros.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int value : numeros) {
            sum += value;
        }
        return sum;
    }

    static int produto1A10() {
        int produto = 1;
        for (int i = 1; i <= 10; i++) {
            produto *= i;
        }
        return produto;
    }

    static int somaPares2A20() {
        int sum = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int somaMultiplos3Entre3E30() {
        int sum = 0;
        for (int i = 3; i <= 30; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static long maior(int[] numeros) {
        if(numeros == null || numeros.length == 0) {
            return 0;
        }
        int higher = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > higher) {
                higher = numeros[i];
            }
        }
        return higher;
    }
}
