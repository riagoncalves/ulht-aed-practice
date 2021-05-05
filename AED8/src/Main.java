import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
  static String getDesambiguador() {
    return "this";
  }

  static ArrayList<String> algoritmosDePesquisa() {
    ArrayList<String> algoritmos = new ArrayList<String>();
    algoritmos.add("Pesquisa Linear");
    algoritmos.add("Pesquisa Binária");

    return algoritmos;
  }

  static String estadoDoArrayParaPesquisaBinaria() {
    return "ordenado";
  }

  static ArrayList<String> algoritmosDeOrdenacao() {
    ArrayList<String> algoritmos = new ArrayList<String>();
    algoritmos.add("Bubble Sort");
    algoritmos.add("Selection Sort");
    algoritmos.add("Merge Sort");
    algoritmos.add("Quick Sort");

    return algoritmos;
  }

  static HashMap<String, String> qualAComplexidade() {
    HashMap<String, String> algoritmos = new HashMap<String, String>();

    algoritmos.put("linear", "N");
    algoritmos.put("binaria", "log2(N)");
    algoritmos.put("bubble", "3NN/4");
    algoritmos.put("selection", "NN/2");
    algoritmos.put("merge", "N*log(N)");
    algoritmos.put("quick", "N*log(N)");

    return algoritmos;
  }

  static HashSet<String> todosOsAlgoritmos() {
    HashSet<String> algoritmos = new HashSet<String>();

    algoritmos.add("linear");
    algoritmos.add("binaria");
    algoritmos.add("bubble");
    algoritmos.add("selection");
    algoritmos.add("merge");
    algoritmos.add("quick");

    return algoritmos;
  }

  static String getTecnologiaDeTestesUnitarios() {
    return "JUnit";
  }

  static String getPrefixoDeTestesUnitarios() {
    return "@Test";
  }

  public static void main(String[] args) {
    System.out.println(algoritmosDePesquisa());
  }
}
