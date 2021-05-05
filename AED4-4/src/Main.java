public class Main {
  static Pessoa[] gerarAmigosDosAnimais() {
    Animal[] animalArr1 = new Animal[1];
    Animal[] animalArr2 = new Animal[2];
    Animal[] animalArr3 = new Animal[1];
    Pessoa[] pessoaArr = new Pessoa[3];

    animalArr1[0] = new Animal("Bimbo", "Cão", 12345);

    animalArr2[0] = new Animal("Planeta", "Cavalo", 33333);
    animalArr2[1] = new Animal("Alfaiate", "Cão", 55555);

    animalArr3[0] = new Animal("Carapau", "Papagaio", 44155);

    pessoaArr[0] = new Pessoa("Victor", "Valente", 12388193, animalArr1);
    pessoaArr[1] = new Pessoa("Rodrigo", "Correia", 12377341, animalArr2);
    pessoaArr[2] = new Pessoa("João", "Batalha", 12300545, animalArr3);

    return pessoaArr;
  }

  static boolean temAnimais(Pessoa pessoa){
    return pessoa.animais != null && pessoa.animais.length > 0;
  }

  static boolean temCaes (Pessoa pessoa) {
    if(temAnimais(pessoa)) {
      for(int i = 0; i < pessoa.animais.length; i++) {
        if (pessoa.animais[i].especie == "Cão") {
          return true;
        }
      }
    }
    return false;
  }

  static boolean temAnimaisEspecie(Pessoa pessoa, String especie) {
    if (pessoa.animais == null || pessoa.animais.length == 0) {
      return false;
    }
    for (int i = 0; i < pessoa.animais.length; i++){
      if(pessoa.animais[i].especie == especie) {
        return true;
      }
    }
    return false;
  }

  static int contarAnimaisEspecie(Pessoa pessoa, String especie) {
    int animais = 0;
    if(temAnimais(pessoa)) {
      for(int i = 0; i < pessoa.animais.length; i++) {
        if (pessoa.animais[i].especie == especie) {
          animais++;
        }
      }
    }
    return animais;
  }

  static Pessoa maiorAmigoDosAnimais(Pessoa pessoa1, Pessoa pessoa2) {
    int qtdAnimaisPessoa1 = 0;
    int qtdAnimaisPessoa2 = 0;

    if (pessoa1.animais != null) {
      for (Animal animal : pessoa1.animais) {
        if (animal != null) {
          qtdAnimaisPessoa1++;
        }
      }
    }
    if (pessoa2.animais != null) {
      for (Animal animal : pessoa2.animais) {
        if (animal != null) {
          qtdAnimaisPessoa2++;
        }
      }
    }

    return qtdAnimaisPessoa1 == qtdAnimaisPessoa2 ? null
            : qtdAnimaisPessoa1 > qtdAnimaisPessoa2 ? pessoa1
            : pessoa2;
  }

  static Animal[] juntarAnimais(Pessoa[] pessoas) {
    int arrL = 0;
    for(int i = 0; i < pessoas.length; i++) {
      if(temAnimais(pessoas[i])) {
        arrL += pessoas[i].animais.length;
      }
    }

    Animal[] anm = new Animal[arrL];
    int indAnm = 0;
    for(int i = 0; i < pessoas.length; i++) {
      if(temAnimais(pessoas[i])) {
        for(int f = 0; f < pessoas[i].animais.length; f++) {
          anm[indAnm] = pessoas[i].animais[f];
          indAnm++;
        }
      }
    }

    return anm;
  }

  public static void main(String[] args) {

  }
}
