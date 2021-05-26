public class Pessoa {
  String nome, apelido, nacionalidade;
  int nrBI;

  Pessoa(){}

  Pessoa(String nome, String apelido, int nrBI){
    this.nome = nome;
    this.apelido = apelido;
    this.nrBI = nrBI;
  }

  Pessoa(String nome, String apelido, int nrBI, String nacionalidade){
    this.nome = nome;
    this.apelido = apelido;
    this.nrBI = nrBI;
    this.nacionalidade = nacionalidade;
  }
}
