import java.util.Arrays;

public class Main {
  static int[] ordenarNumerosBubbleSort(int[] numeros) {
    boolean tudoOrdenado = false;
    int ultimoOrdenado = numeros.length;

    while (!tudoOrdenado) {
      tudoOrdenado = true;

      for (int i = 0; i < ultimoOrdenado - 1; i++) {
        if (numeros[i] > numeros[i + 1]) {
          tudoOrdenado = false;

          int temp = numeros[i];
          numeros[i] = numeros[i + 1];
          numeros[i + 1] = temp;
        }
      }

      ultimoOrdenado--;
    }

    return numeros;
  }

  static int[] ordenarNumerosSelSort(int[] numeros) {
    int maiorOrdenadoPos = -1;

    while (maiorOrdenadoPos < numeros.length - 1) {
      int minPos = maiorOrdenadoPos + 1;

      for (int i = minPos + 1; i < numeros.length; i++) {
        if (numeros[i] < numeros[minPos]) {
          minPos = i;
        }
      }

      maiorOrdenadoPos++;

      if (maiorOrdenadoPos != minPos) {
        int temp = numeros[maiorOrdenadoPos];
        numeros[maiorOrdenadoPos] = numeros[minPos];
        numeros[minPos] = temp;
      }
    }

    return numeros;
  }

  static int[] ordenarNumerosBubbleSortCount(int[] numeros) {
    int[] count = {0,0};
    boolean tudoOrdenado = false;
    int ultimoOrdenado = numeros.length;

    while (!tudoOrdenado) {
      tudoOrdenado = true;

      for (int i = 0; i < ultimoOrdenado - 1; i++) {
        count[1]++;
        if (numeros[i] > numeros[i + 1]) {
          tudoOrdenado = false;

          int temp = numeros[i];
          numeros[i] = numeros[i + 1];
          numeros[i + 1] = temp;
          count[0]++;
        }
      }

      ultimoOrdenado--;
    }

    return count;
  }

  static int[] ordenarNumerosSelSortCount(int[] numeros) {
    int[] count = {0,0};
    int maiorOrdenadoPos = -1;

    while (maiorOrdenadoPos < numeros.length - 1) {
      int minPos = maiorOrdenadoPos + 1;

      for (int i = minPos + 1; i < numeros.length; i++) {
        if (numeros[i] < numeros[minPos]) {
          minPos = i;
        }
        count[1]++;
      }
      maiorOrdenadoPos++;

      if (maiorOrdenadoPos != minPos) {
        int temp = numeros[maiorOrdenadoPos];
        numeros[maiorOrdenadoPos] = numeros[minPos];
        numeros[minPos] = temp;
        count[0]++;
      }
    }

    return count;
  }


  public static long[] medirTempos() {
    long[] results = new long[4];
    int[] bigArr = Gerador.criarArrayInts(50000);
    int[] smallArr = Gerador.criarArrayInts(10);

    long tInicial = System.currentTimeMillis();
    ordenarNumerosBubbleSort(bigArr);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarNumerosSelSort(bigArr);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarNumerosBubbleSort(smallArr);
    tFinal = System.currentTimeMillis();

    results[2] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarNumerosSelSort(smallArr);
    tFinal = System.currentTimeMillis();

    results[3] = tFinal - tInicial;

    return results;
  }

  public static int[] estatisticas(int[] dados) {
    int[] stats = new int[4];
    int[] bbsArr = dados.clone();
    int[] slsArr = dados.clone();
    int[] countBBS = ordenarNumerosBubbleSortCount(bbsArr);
    int[] countSLS = ordenarNumerosSelSortCount(slsArr);

    stats[0] = countBBS[0];
    stats[1] = countBBS[1];
    stats[2] = countSLS[0];
    stats[3] = countSLS[1];

    return stats;
  }

  public static void main(String[] args) {
  }
}
