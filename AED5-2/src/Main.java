import java.util.Arrays;

public class Main {
  static boolean procurarPessoaPorBILin(Pessoa[] pessoas, int nrBI) {
    if(pessoas == null || pessoas.length == 0) {
      return false;
    }

    for(int i = 0; i < pessoas.length; i++) {
      if(pessoas[i].nrBI == nrBI) {
        return true;
      }
    }

    return false;
  }

  static boolean procurarPessoaPorBIBin(Pessoa[] pessoas, int nrBI)  {
    int left = 0, right = pessoas.length - 1;

    while (left <= right) {
      int middleIndex = (left + right) / 2;

      if(pessoas[middleIndex].nrBI == nrBI) {
        return true;
      }

      if(pessoas[middleIndex].nrBI < nrBI) {
        left = middleIndex + 1;
      }
      else {
        right = middleIndex - 1;
      }
    }

    return false;
  }

  static Pessoa obterPessoa(Pessoa[] pessoas, int nrBI) {
    if(pessoas == null || pessoas.length == 0) {
      return null;
    }

    for(int i = 0; i < pessoas.length; i++) {
      if(pessoas[i].nrBI == nrBI) {
        return pessoas[i];
      }
    }

    return null;
  }

  static Pessoa obterPessoaPorBI(Pessoa[] pessoas, int nrBI) {
    int left = 0, right = pessoas.length - 1;

    while (left <= right) {
      int middleIndex = (left + right) / 2;

      if(pessoas[middleIndex].nrBI == nrBI) {
        return pessoas[middleIndex];
      }

      if(pessoas[middleIndex].nrBI < nrBI) {
        left = middleIndex + 1;
      }
      else {
        right = middleIndex - 1;
      }
    }

    return null;
  }

  public static long[] medirTempos() {
    long[] results = new long[4];
    Pessoa[] bigArr = GeradorPessoasOrdenadas.criarArrayPessoas(1000000);
    Pessoa[] smallArr = GeradorPessoasOrdenadas.criarArrayPessoas(10);

    long tInicial = System.currentTimeMillis();
    procurarPessoaPorBILin(bigArr, 810000);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    procurarPessoaPorBIBin(bigArr, 810000);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    procurarPessoaPorBILin(smallArr, 10008);
    tFinal = System.currentTimeMillis();

    results[2] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    procurarPessoaPorBIBin(smallArr, 10008);
    tFinal = System.currentTimeMillis();

    results[3] = tFinal - tInicial;

    return results;
  }


  public static void main(String[] args) {

  }
}
