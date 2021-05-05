public class Livro {
  String titulo, autor;
  int nrEdicao;

  Livro() {}

  Livro(String titulo, String autor, int nrEdicao) {
    this.titulo = titulo;
    this.autor = autor;
    this.nrEdicao =  nrEdicao;
  }

  public String toString() {
    return titulo + " | " + autor + " | " + nrEdicao;
  }
}
