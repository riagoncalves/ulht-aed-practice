import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
  static Pessoa[] arrayGrandeDePessoas() {
    return Gerador.criarArrayPessoas(1000000);
  }

  static ArrayList<Pessoa> meusAmigos() {
    Pessoa[] arr  = arrayGrandeDePessoas();
    ArrayList<Pessoa> pessoas  = new ArrayList<Pessoa>();

    for (Pessoa pessoa: arr) {
      pessoas.add(pessoa);
    }

    return pessoas;
  }

  static LinkedList<Pessoa> meusColegas() {
    Pessoa[] arr  = arrayGrandeDePessoas();
    LinkedList<Pessoa> pessoas  = new LinkedList<Pessoa>();

    for (Pessoa pessoa: arr) {
      pessoas.add(pessoa);
    }

    return pessoas;
  }

  static long[] medirTemposIntroducao() {
    long[] results = new long[2];

    long tInicial = System.currentTimeMillis();
    meusAmigos();
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    meusColegas();
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    return results;
  }

  static long[] medirTemposIntroducaoNoInicio() {
    long[] results = new long[2];
    ArrayList<Pessoa> list = meusAmigos();
    LinkedList<Pessoa> linked  = meusColegas();
    Pessoa pessoa = Gerador.gerarPessoa(0);

    long tInicial = System.currentTimeMillis();
    list.add(0, pessoa);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    linked.addFirst(pessoa);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    return results;
  }

  static long[] medirTemposIntroducaoNoMeio() {
    long[] results = new long[2];
    ArrayList<Pessoa> list = meusAmigos();
    LinkedList<Pessoa> linked  = meusColegas();
    Pessoa pessoa = Gerador.gerarPessoa(0);

    long tInicial = System.currentTimeMillis();
    list.add(list.size() / 2 , pessoa);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    linked.add(linked.size() / 2, pessoa);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    return results;
  }

  static long[] medirTemposIntroducaoNoFim() {
    long[] results = new long[2];
    ArrayList<Pessoa> list = meusAmigos();
    LinkedList<Pessoa> linked  = meusColegas();
    Pessoa pessoa = Gerador.gerarPessoa(0);

    long tInicial = System.currentTimeMillis();
    list.add(list.size() , pessoa);
    long tFinal = System.currentTimeMillis();

    results[0] = tFinal - tInicial;

    tInicial = System.currentTimeMillis();
    linked.add(linked.size(), pessoa);
    tFinal = System.currentTimeMillis();

    results[1] = tFinal - tInicial;

    return results;
  }

  static String explicarResultados() {
    return "ArrayList e LinkedList são ambas rápidas a inserir/remover no fim," +
            "a LinkedList é mais rapida a inserir/remover no inicio" +
            "ambas lentas a inserir no meio," +
            "Arraylist mais rápida a aceder e pesquisar";
  }


  static long quantosElementosConsigoMeterNumArrayList() {
    return 1000000;
  }

  static long quantosElementosConsigoMeterNumaLinkedList() {
    return 1000000;
  }

  public static void main(String[] args) {
    ArrayList<Pessoa> listaA = new ArrayList<Pessoa>();
    listaA.add(new Pessoa("Francesco", "Totti", 12300321));
    listaA.add(0, new Pessoa());
    LinkedList<Pessoa> listaB = new LinkedList<Pessoa>();
    listaB.add(new Pessoa("Salvador", "Sobral", 12312300));
    listaB.add(0, new Pessoa());

    System.out.println(quantosElementosConsigoMeterNumaLinkedList());
  }
}
