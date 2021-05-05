public class Pessoa {
  String nome;
  String apelido;

  Pessoa(String nome, String apelido) {
    this.nome = nome;
    this.apelido = apelido;
  }

  Pessoa() {
  }

  public String toString() {
    return "Bom dia, chamo-me: " + this.nome + " " + this.apelido;
  }
}