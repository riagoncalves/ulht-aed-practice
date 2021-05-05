class Apartamento {
  String rua;
  int nrPorta;
  String localidade;
  String pais;

  Apartamento(String rua, int nrPorta, String localidade, String pais) {
    this.rua = rua;
    this.nrPorta = nrPorta;
    this.localidade = localidade;
    this.pais = pais;
  }

  Apartamento(){}

  public String toString(){
    return this.rua + " " + this.nrPorta + ", " + this.localidade + ", " + this.pais;
  }
}

public class Pessoa {
  String nome;
  String apelido;
  Apartamento apartamento;

  Pessoa(String nome, String apelido) {
    this.nome = nome;
    this.apelido = apelido;
  }
  Pessoa(String nome, String apelido, Apartamento apartamento) {
    this.nome = nome;
    this.apelido = apelido;
    this.apartamento = apartamento;
  }

  Pessoa() {
  }

  public String toString() {
    if(this.apartamento == null) {
      return this.nome + " " + this.apelido + " | Morada: desconhecida";
    }
    else {
      return this.nome + " " + this.apelido + " | Morada: " + this.apartamento.rua + " " + this.apartamento.nrPorta + ", " + this.apartamento.localidade + ", " + this.apartamento.pais;
    }
  }
}