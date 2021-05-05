public class Main {
  static boolean procurarPessoa(Pessoa[] pessoas, String nome, String apelido) {
    for(int i = 0; i < pessoas.length; i++) {
      if(pessoas[i].nome.equals(nome) && pessoas[i].apelido.equals(apelido)) {
        return true;
      }
    }

    return false;
  }

  static int contarPessoasNacionalidade(Pessoa[] pessoas, String nacionalidade) {
    int result = 0;

    for(int i = 0; i < pessoas.length; i++) {
      if(pessoas[i] != null && pessoas[i].nacionalidade.equals(nacionalidade)) {
        result++;
      }
    }

    return result;
  }

  static Pessoa pessoaComOMaiorBI(Pessoa[] pessoas) {
    if (pessoas == null || pessoas.length == 0) {
      return null;
    }

    Pessoa maior = pessoas[0];

    for(int i = 0; i < pessoas.length; i++) {
      if(pessoas[i].nrBI > maior.nrBI) {
        maior = pessoas[i];
      }
    }

    return maior;
  }

  public static void main(String[] args) {

  }
}
