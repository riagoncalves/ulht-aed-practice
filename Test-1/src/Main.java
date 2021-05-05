import java.util.Arrays;

public class Main {
  static short[] minhaIdentificacao() {
    short[] num = {2, 2, 0, 0, 0, 4, 9 ,2};
    return num;
  }

  static int belaFunc(int n) {
    if(n < 0) {
      return 0;
    }
    else if(n == 0) {
      return 1;
    }
    else if(n == 1) {
      return 33;
    }
    else if(n >= 2 && n <= 10) {
      return n + belaFunc(n - 1);
    }
    else {
      return n + belaFunc(n - 1) - belaFunc(n - 2);
    }
  }

  static boolean procurarLetra(String palavra, char letra) {

    if(palavra == null || palavra.length() == 0) {
      return false;
    }
    else if(palavra.charAt(0) == letra) {
      return true;
    }
    else {
      String subStr = palavra.substring(1, palavra.length());
      return procurarLetra(subStr, letra);
    }

  }

  public static void main(String[] args) {
  }
}
