public class Main {
  static ListaPessoas meusColegas() {
    Node node1 = new Node(new Pessoa("Aaa", 111, "Portuguesa"));
    Node node2 = new Node(new Pessoa("Bbb", 222, "Portuguesa"));
    node1.next = node2;
    return new ListaPessoas(node1, node2);
  }

  public static void main(String[] args) {
    ListaPessoas list = ListaPessoasFunctions.adicionarPessoa(new ListaPessoas(null, null), new Pessoa("Aaa", 111, "Portuguesa"));
    list = ListaPessoasFunctions.adicionarPessoa(list, new Pessoa("Aaa", 111, "Portuguesa"));
    list = ListaPessoasFunctions.adicionarPessoa(list, new Pessoa("Aaa", 111, "Portuguesa"));
    System.out.println(list.toString());
  }
}
