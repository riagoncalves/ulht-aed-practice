import java.util.Arrays;

public class Main {
  static int partition(Pessoa[] numeros, int left, int right) {

    Pessoa pivot = numeros[right];
    int leftIdx = left;
    int rightIdx = right - 1;
    while (leftIdx <= rightIdx) {

      if (numeros[leftIdx].nrBI > pivot.nrBI && numeros[rightIdx].nrBI < pivot.nrBI) {
        Pessoa temp = numeros[leftIdx];
        numeros[leftIdx] = numeros[rightIdx];
        numeros[rightIdx] = temp;
      }

      if (numeros[leftIdx].nrBI <= pivot.nrBI) {
        leftIdx++;
      }

      if (numeros[rightIdx].nrBI >= pivot.nrBI) {
        rightIdx--;
      }
    }

    numeros[right] = numeros[leftIdx];
    numeros[leftIdx] = pivot;
    return leftIdx;
  }

  static Pessoa[] quickSort(Pessoa[] numeros, int left, int right) {
    if (left < right) {
      int posicaoPivot = partition(numeros, left, right - 1);

      numeros = quickSort(numeros, left, posicaoPivot);
      numeros = quickSort(numeros, posicaoPivot + 1, right);
    }

    return numeros;
  }

  static Pessoa[] merge(Pessoa[] arrayA, Pessoa[] arrayB) {
    Pessoa[] result = new Pessoa[arrayA.length + arrayB.length];

    int posicaoA = 0, posicaoB = 0, posicaoResult = 0;

    while (posicaoA < arrayA.length && posicaoB < arrayB.length) {
      if(arrayA[posicaoA].nrBI < arrayB[posicaoB].nrBI) {
        result[posicaoResult] = arrayA[posicaoA];
        posicaoA++;
      }
      else {
        result[posicaoResult] = arrayB[posicaoB];
        posicaoB++;
      }
      posicaoResult++;
    }

    while (posicaoA < arrayA.length) {
      result[posicaoResult] = arrayA[posicaoA];
      posicaoA++;
      posicaoResult++;
    }

    while (posicaoB < arrayB.length) {
      result[posicaoResult] = arrayB[posicaoB];
      posicaoB++;
      posicaoResult++;
    }

    return result;
  }


  static Pessoa[] mergeSort(Pessoa[] pessoas) {
    if (pessoas == null || pessoas.length <= 1) {
      return pessoas;
    }

    int left = 0, right = pessoas.length, middle = pessoas.length / 2;

    Pessoa[] pessoasLeft = Arrays.copyOfRange(pessoas, left, middle);
    Pessoa[] pessoasRight = Arrays.copyOfRange(pessoas, middle, right);

    pessoasLeft = mergeSort(pessoasLeft);
    pessoasRight = mergeSort(pessoasRight);

    return merge(pessoasLeft, pessoasRight);
  }

  static Pessoa[] ordenarPessoasPorBIMergeSort(Pessoa[] pessoas) {
    return mergeSort(pessoas);
  }

  static Pessoa[] ordenarPessoasPorBIQuickSort(Pessoa[] pessoas) {
    return quickSort(pessoas, 0, pessoas.length);
  }

  public static long[] medirTempos() {
    long[] results = new long[4];
    Pessoa[] bigArr1 = Gerador.criarArrayPessoas(30000);
    Pessoa[] bigArr2 = bigArr1.clone();
    Pessoa[] smallArr1 = Gerador.criarArrayPessoas(10);
    Pessoa[] smallArr2 = smallArr1.clone();

    long tInicial = System.currentTimeMillis();
    ordenarPessoasPorBIMergeSort(bigArr1);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarPessoasPorBIQuickSort(bigArr2);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarPessoasPorBIMergeSort(smallArr1);
    tFinal = System.currentTimeMillis();

    results[2] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarPessoasPorBIQuickSort(smallArr2);
    tFinal = System.currentTimeMillis();

    results[3] = tFinal - tInicial;

    return results;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(medirTempos()));
  }
}
