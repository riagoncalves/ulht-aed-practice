public class Main {
  static PilhaLivros minhaBiblioteca() {
    PilhaLivros pilha = new PilhaLivros(3);
    PilhaLivrosFunctions.push(pilha, new Livro("Os Maias", "Eça de Queirós", 39));
    PilhaLivrosFunctions.push(pilha, new Livro("Os Lusíadas", "L. V. Camões", 15));
    PilhaLivrosFunctions.push(pilha, new Livro("Viagens na minha terra", "Almeida Garrett", 25));
    return pilha;
  }

  public static void main(String[] args) {

  }
}
