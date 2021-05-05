public class Main {
  static Pessoa[] tresAmigos() {
    Pessoa[] arr = new Pessoa[3];
    arr[0] = new Pessoa();
    arr[0].nome = "John";
    arr[0].apelido = "Doe";
    arr[1] = new Pessoa("John", "Doe");
    arr[2] = new Pessoa("John", "Doe");
    return arr;
  }

  public static void main(String[] args) {

  }
}
