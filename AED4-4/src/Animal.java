public class Animal {
  String nome;
  String especie;
  int nrRegisto;

  Animal(String nome, String especie, int nrRegisto) {
    this.nome = nome;
    this.especie = especie;
    this.nrRegisto = nrRegisto;
  }

  Animal() {
  }

  public String toString() {
    return "Bom dia, chamo-me: " + this.nome + " " + this.especie;
  }
}