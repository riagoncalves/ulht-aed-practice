import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

  static ArrayList meusColegas() {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    pessoas.add(new Pessoa("Exemplo", "Um", 1111));
    pessoas.add(new Pessoa("Exemplo", "Dois", 2222));
    pessoas.add(new Pessoa("Exemplo", "Tres", 3333));
    return pessoas;
  }

  static HashMap meusAlunos() {
    HashMap<Integer, Pessoa> dicionario = new HashMap<Integer, Pessoa>();
    dicionario.put(1, new Pessoa("Exemplo", "Um", 1111));
    dicionario.put(2, new Pessoa("Exemplo", "Dois", 2222));
    dicionario.put(3, new Pessoa("Exemplo", "Tres", 3333));
    return dicionario;
  }

  static HashSet todasAsPessoas() {
    HashSet<Pessoa> conjunto = new HashSet<Pessoa>();
    conjunto.add(new Pessoa("Exemplo", "Um", 1111));
    conjunto.add(new Pessoa("Exemplo", "Dois", 2222));
    conjunto.add(new Pessoa("Exemplo", "Tres", 3333));
    return conjunto;
  }

  static boolean existePessoaEmAL(ArrayList<Pessoa> pessoas, Pessoa p) {
    if (pessoas == null || p == null) {
      return false;
    }

    for (Pessoa pessoa: pessoas) {
      if(pessoa.nrBI == p.nrBI) {
        return true;
      }
    }
    return false;
  }

  static HashMap tornarHM(Pessoa[] pessoas) {
    HashMap<String, Integer> dicionario = new HashMap<String, Integer>();
    int num = 0;
    for (Pessoa pessoa: pessoas) {
      num = 0;
      for (Pessoa pessoaWithName : pessoas) {
        if (pessoaWithName.nome.equals(pessoa.nome)) {
          num ++;
        }
      }
      dicionario.put(pessoa.nome, num);
    }

    return dicionario;
  }

  static boolean existePessoaEmHS(HashSet<Pessoa> pessoas, Pessoa p) {
    if (pessoas == null || p == null) {
      return false;
    }

    for (Pessoa pessoa: pessoas) {
      if(pessoa.nrBI == p.nrBI) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

  }
}
