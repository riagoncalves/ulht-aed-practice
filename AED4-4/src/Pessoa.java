public class Pessoa {
  String nome;
  String apelido;
  int nrBI;
  Animal[] animais;

  Pessoa(String nome, String apelido, int nrBI, Animal[] animais) {
    this.nome = nome;
    this.apelido = apelido;
    this.nrBI = nrBI;
    this.animais = animais;
  }

  Pessoa() {
  }
}