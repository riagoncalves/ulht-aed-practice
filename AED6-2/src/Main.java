import java.util.Arrays;

public class Main {

  static int[] ordenarPessoasPorBIBubbleSort(Pessoa[] pessoas) {
    int[] count = {0,0};
    boolean tudoOrdenado = false;
    int ultimoOrdenado = pessoas.length;

    while (!tudoOrdenado) {
      tudoOrdenado = true;

      for (int i = 0; i < ultimoOrdenado - 1; i++) {
        count[1]++;
        if (pessoas[i].nrBI > pessoas[i + 1].nrBI) {
          tudoOrdenado = false;

          Pessoa temp = pessoas[i];
          pessoas[i] = pessoas[i + 1];
          pessoas[i + 1] = temp;
          count[0]++;
        }
      }

      ultimoOrdenado--;
    }

    return count;
  }

  static int[] ordenarPessoasPorBISelSort(Pessoa[] pessoas) {
    int[] count = {0,0};
    int maiorOrdenadoPos = -1;

    while (maiorOrdenadoPos < pessoas.length - 1) {
      int minPos = maiorOrdenadoPos + 1;

      for (int i = minPos + 1; i < pessoas.length; i++) {
        if (pessoas[i].nrBI < pessoas[minPos].nrBI) {
          minPos = i;
        }
        count[1]++;
      }

      maiorOrdenadoPos++;

      if (maiorOrdenadoPos != minPos) {
        Pessoa temp = pessoas[maiorOrdenadoPos];
        pessoas[maiorOrdenadoPos] = pessoas[minPos];
        pessoas[minPos] = temp;
        count[0]++;
      }
    }

    return count;
  }


  public static long[] medirTempos() {
    long[] results = new long[4];
    Pessoa[] bigArr = Gerador.criarArrayPessoas(30000);
    Pessoa[] smallArr = Gerador.criarArrayPessoas(10);

    long tInicial = System.currentTimeMillis();
    ordenarPessoasPorBIBubbleSort(bigArr);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarPessoasPorBISelSort(bigArr);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarPessoasPorBIBubbleSort(smallArr);
    tFinal = System.currentTimeMillis();

    results[2] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarPessoasPorBISelSort(smallArr);
    tFinal = System.currentTimeMillis();

    results[3] = tFinal - tInicial;

    return results;
  }

  public static int[] estatisticas(Pessoa[] dados) {
    int[] stats = new int[4];
    Pessoa[] bbsArr = dados.clone();
    Pessoa[] slsArr = dados.clone();
    int[] countBBS = ordenarPessoasPorBIBubbleSort(bbsArr);
    int[] countSLS = ordenarPessoasPorBISelSort(slsArr);

    stats[0] = countBBS[0];
    stats[1] = countBBS[1];
    stats[2] = countSLS[0];
    stats[3] = countSLS[1];

    return stats;
  }

  public static void main(String[] args) {
  }
}
