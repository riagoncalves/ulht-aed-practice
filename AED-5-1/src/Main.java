import java.util.Arrays;

public class Main {
  static boolean procurarNumeroLin(int[] numeros, int valor) {
    if(numeros == null || numeros.length == 0) {
      return false;
    }

    for (int i = 0; i < numeros.length; i++) {
      if(numeros[i] == valor) {
        return true;
      }
    }

    return false;
  }

  static boolean procurarNumeroBin(int[] numeros, int valor) {
    if(numeros == null || numeros.length == 0) {
      return false;
    }

    int middleIndex = numeros.length / 2;

    if(numeros[middleIndex] == valor) {
      return true;
    }
    else if(numeros[middleIndex] > valor) {
      return procurarNumeroBin(Arrays.copyOfRange(numeros, 0, middleIndex), valor);
    }
    else if(numeros[middleIndex] < valor) {
      return procurarNumeroBin(Arrays.copyOfRange(numeros, middleIndex, numeros.length), valor);
    }
    else {
      return false;
    }
  }

  public static long[] medirTempos() {
    long[] results = new long[4];
    int[] bigArr = GeradorNumerosOrdenados.criarArrayInts(1000000);
    int[] smallArr = GeradorNumerosOrdenados.criarArrayInts(10);

    long tInicial = System.currentTimeMillis();
    procurarNumeroLin(bigArr, 800000);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    procurarNumeroBin(bigArr, 800000);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    procurarNumeroLin(smallArr, 8);
    tFinal = System.currentTimeMillis();

    results[2] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    procurarNumeroBin(smallArr, 8);
    tFinal = System.currentTimeMillis();

    results[3] = tFinal - tInicial;

    return results;
  }

  public static void main(String[] args) {
    System.out.println((Arrays.toString(medirTempos())));

  }
}
