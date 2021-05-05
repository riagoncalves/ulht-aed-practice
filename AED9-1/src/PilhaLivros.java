public class PilhaLivros {
  Livro[] livros;
  int topo;

  PilhaLivros(){
    this.topo = -1;
  }

  PilhaLivros(int bookLenght) {
    this.livros = new Livro[bookLenght];
    this.topo = -1;
  }
}
