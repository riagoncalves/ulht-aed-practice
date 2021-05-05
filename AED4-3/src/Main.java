public class Main {
  static Pessoa[] novosAmigos() {
    Pessoa[] arr = new Pessoa[2];
    arr[0] = new Pessoa("John" , "Doe");
    arr[1] = new Pessoa("John" , "Doe", new Apartamento("Rua Sésamo", 13, "Mafra", "Portugal"));
    return arr;
  }
  public static void main(String[] args) {

  }
}
