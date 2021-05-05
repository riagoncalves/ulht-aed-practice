import java.util.Arrays;

public class Main {

  static Planeta[] meusPlanetas() {
    Planeta[] planetas = new Planeta[3];
    planetas[0] = new Planeta("Terra", "nitrogenio", 22000492, true);
    planetas[1] = new Planeta("Saturno", "hidrogenio", 62, false);
    planetas[2] = new Planeta("Lua", "nao tem", 0, false);
    return planetas;
  }

  static Planeta[] merge(Planeta[] arrayA, Planeta[] arrayB) {
    Planeta[] result = new Planeta[arrayA.length + arrayB.length];
    double multipler = 1.6180;

    int posicaoA = 0, posicaoB = 0, posicaoResult = 0;

    while (posicaoA < arrayA.length && posicaoB < arrayB.length) {
      if(arrayA[posicaoA].luas * multipler < arrayB[posicaoB].luas * multipler) {
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

  static Planeta[] ordenarPlanetasMergeSort(Planeta[] planetas) {
    if (planetas == null || planetas.length <= 1) {
      return planetas;
    }

    int left = 0, right = planetas.length, middle = planetas.length / 2;

    Planeta[] planetasLeft = Arrays.copyOfRange(planetas, left, middle);
    Planeta[] planetasRight = Arrays.copyOfRange(planetas, middle, right);

    planetasLeft = ordenarPlanetasMergeSort(planetasLeft);
    planetasRight = ordenarPlanetasMergeSort(planetasRight);

    return merge(planetasLeft, planetasRight);
  }

  public static void main(String[] args) {

  }
}
