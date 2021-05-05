public class Planeta {
  String nome, atmosfera;
  int luas;
  boolean habitavel;

  Planeta() {}

  Planeta(String nome, String atmosfera, int luas, boolean habitavel) {
    this.nome = nome;
    this.atmosfera = atmosfera;
    this.luas = luas;
    this.habitavel = habitavel;
  }

  @Override
  public String toString() {
    if (this.habitavel) {
      return this.nome + " | " + this.atmosfera + " | " + this.luas  + " - habitavel";
    }
    else {
      return this.nome + " | " + this.atmosfera + " | " + this.luas;
    }
  }
}
