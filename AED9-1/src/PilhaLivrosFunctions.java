public class PilhaLivrosFunctions {
  static void push(PilhaLivros pilha, Livro obj) {
    if (pilha != null && obj != null && pilha.topo < pilha.livros.length - 1) {
      pilha.topo++;
      pilha.livros[pilha.topo] = obj;
    }
  }

  static Livro pop(PilhaLivros pilha) {
    if (pilha != null && pilha.topo >= 0) {
      Livro livro = pilha.livros[pilha.topo];
      pilha.livros[pilha.topo] = null;
      pilha.topo--;
      return livro;
    }
    else {
      return null;
    }
  }

  static boolean isEmpty(PilhaLivros pilha) {
    if (pilha == null || pilha.livros == null || pilha.topo < 0) {
      return true;
    }
    return false;
  }

  static Livro peek(PilhaLivros pilha) {
    if (pilha != null && pilha.topo >= 0) {
      Livro livro = pilha.livros[pilha.topo];
      return livro;
    }
    else {
      return null;
    }
  }

  static void mostrarPilha(PilhaLivros pilha) {
    for (Livro livro: pilha.livros) {
      System.out.println(livro);
    }
  }
}
