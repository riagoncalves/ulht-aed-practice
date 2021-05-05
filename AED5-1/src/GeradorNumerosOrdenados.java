import java.util.Random;

class GeradorNumerosOrdenados{

  static int[] criarArrayInts(int nr) {
    int[] resultado = new int[nr];
    for(int i=0; i<nr; i++) {
      resultado[i] = i * 2;
    }
    return resultado;
  }

}