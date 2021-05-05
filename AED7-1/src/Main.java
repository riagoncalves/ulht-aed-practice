import java.util.Arrays;

public class Main {
  static int partition(int[] numeros, int left, int right) {

    int pivot = numeros[right];
    int leftIdx = left;
    int rightIdx = right - 1;
    while (leftIdx <= rightIdx) {

      if (numeros[leftIdx] > pivot && numeros[rightIdx] < pivot) {
        int temp = numeros[leftIdx];
        numeros[leftIdx] = numeros[rightIdx];
        numeros[rightIdx] = temp;
      }

      if (numeros[leftIdx] <= pivot) {
        leftIdx++;
      }

      if (numeros[rightIdx] >= pivot) {
        rightIdx--;
      }
    }

    numeros[right] = numeros[leftIdx];
    numeros[leftIdx] = pivot;
    return leftIdx;
  }

  static int[] quickSort(int[] numeros, int left, int right) {
    if (left < right) {
      int posicaoPivot = partition(numeros, left, right - 1);

      numeros = quickSort(numeros, left, posicaoPivot);
      numeros = quickSort(numeros, posicaoPivot + 1, right);
    }

    return numeros;
  }

  static int[] merge(int[] arrayA, int[] arrayB) {
    int[] result = new int[arrayA.length + arrayB.length];

    int posicaoA = 0, posicaoB = 0, posicaoResult = 0;

    while (posicaoA < arrayA.length && posicaoB < arrayB.length) {
      if(arrayA[posicaoA] < arrayB[posicaoB]) {
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


  static int[] mergeSort(int[] numeros) {
    if (numeros == null || numeros.length <= 1) {
      return numeros;
    }

    int left = 0, right = numeros.length, middle = numeros.length / 2;

    int[] numerosLeft = Arrays.copyOfRange(numeros, left, middle);
    int[] numerosRight = Arrays.copyOfRange(numeros, middle, right);

    numerosLeft = ordenarNumerosMergeSort(numerosLeft);
    numerosRight = ordenarNumerosMergeSort(numerosRight);

    return merge(numerosLeft, numerosRight);
  }

  static int[] ordenarNumerosMergeSort(int[] numeros) {
    return mergeSort(numeros);
  }

  static int[] ordenarNumerosQuickSort(int[] numeros) {
    return quickSort(numeros, 0, numeros.length);
  }

  public static long[] medirTempos() {
    long[] results = new long[4];
    int[] bigArr1 = Gerador.criarArrayInts(50000);
    int[] bigArr2 = bigArr1.clone();
    int[] smallArr1 = Gerador.criarArrayInts(10);
    int[] smallArr2 = smallArr1.clone();

    long tInicial = System.currentTimeMillis();
    ordenarNumerosMergeSort(bigArr1);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarNumerosQuickSort(bigArr2);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarNumerosMergeSort(smallArr1);
    tFinal = System.currentTimeMillis();

    results[2] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    ordenarNumerosQuickSort(smallArr2);
    tFinal = System.currentTimeMillis();

    results[3] = tFinal - tInicial;

    return results;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(medirTempos()));
  }
}
