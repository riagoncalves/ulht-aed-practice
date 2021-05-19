public class ListaPessoasFunctions {
  static ListaPessoas adicionarPessoa(ListaPessoas pessoas, Pessoa pessoa) {
    Node node = new Node(pessoa);
    if (pessoas.head == null) {
      pessoas.head = pessoas.tail = node;
    }
    else {
      pessoas.tail.next = node;
      pessoas.tail = node;
    }

    return pessoas;
  }


  static ListaPessoas removerPessoa(ListaPessoas pessoas, Pessoa pessoa) {
    Node current = pessoas.head;
    Node previous = null;

    if (pessoa == null) {
      return pessoas;
    }

    while (current != null) {
      if(current.value.bI == pessoa.bI) {
        if (previous == null) {
          pessoas.head = current.next;

          if (current.next == null) {
            pessoas.tail = pessoas.head;
          }
        }
        else {
          if(current.next == null) {
            pessoas.tail = previous;
          }
          else {
            previous.next = current.next;
          }
        }
      }
      previous = current;
      current = current.next;
    }

    return pessoas;
  }

  static String obterDadosPessoas(ListaPessoas pessoas) {
    if (pessoas == null) {
      return null;
    }
    Node current = pessoas.head;
    String allData = "";

    while (current != null) {
      allData += current.value.bI + " " + current.value.nome + " (" + current.value.nacionalidade + ")\n";
      current = current.next;
    }

    return allData;
  }

  static int contarPessoas(ListaPessoas pessoas) {
    if (pessoas == null) {
      return 0;
    }
    int allPeople = 0;
    Node current = pessoas.head;

    while (current != null) {
      allPeople++;
      current = current.next;
    }

    return allPeople;
  }

  static int contarPessoasNacionalidade(ListaPessoas pessoas, String Nacionalidade) {
    if (pessoas == null) {
      return 0;
    }
    int allPeople = 0;
    Node current = pessoas.head;

    while (current != null) {
      if (current.value.nacionalidade.equals(Nacionalidade)) {
       allPeople++;
      }

      current = current.next;
    }

    return allPeople;
  }

  static boolean procurarPessoa(ListaPessoas pessoas, int bi) {
    if (pessoas == null) {
      return false;
    }

    Node current = pessoas.head;

    while (current != null) {
      if (current.value.bI == bi) {
        return true;
      }

      current = current.next;
    }

    return false;
  }

  static ListaPessoas adicionarPessoa(ListaPessoas pessoas, Pessoa p, int posicao) {

    if (pessoas == null || p == null) {
      return pessoas;
    }

    int index = 0;
    Node current = pessoas.head;
    Node previous = null;
    Node next = null;
    Node newNode = new Node(p);

    while (current != null) {
      if (index == posicao) {
        if (previous != null) {
          next = previous.next;
          previous.next = newNode;
        }

        newNode.next = next;
      }

      index++;
      previous = current;
      current = current.next;
    }

    return pessoas;
  }

  static ListaPessoas inverterLista(ListaPessoas pessoas) {
    if (pessoas == null) {
      return pessoas;
    }

    Node current = pessoas.head;
    Node previous = null;
    Node temp = null;

    while (current != null) {
      previous = current;
      current = current.next;
      current.next = previous;
    }

    temp = pessoas.head;
    pessoas.head = pessoas.tail;
    pessoas.tail = temp;

    return pessoas;
  }
}
