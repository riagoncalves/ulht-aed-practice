public class ArvoreFunctions {
  static Arvore obterFamiliaDonSanchoI() {
    Arvore arv = new Arvore(new TreeNode(new Pessoa("Don Sancho I", 1)));
    TreeNode node = arv.rootNode;
    TreeNode nodeLeft = null;
    TreeNode nodeRight = null;

    node.left = new TreeNode(new Pessoa("Don Afonso Henriques", 1));
    node.right = new TreeNode(new Pessoa("Mafalda de Saboia", 1));
    nodeLeft = node.left;
    nodeRight = node.right;

    nodeLeft.left = new TreeNode(new Pessoa("Henrique de Borgonha", 1));
    nodeLeft.right = new TreeNode(new Pessoa("Teresa de Leão", 1));

    nodeRight.left = new TreeNode(new Pessoa("Amadeu III de Saboia", 1));
    nodeRight.right = new TreeNode(new Pessoa("Mafalda de Albon", 1));

    return arv;
  }

  static int contarNiveis(Arvore a) {
    TreeNode node = a.rootNode;
    int count = 0;

    while (node != null) {
      count++;
      node = node.right;
    }

    return count;
  }

  static boolean procurarPessoa(Arvore arvore, Pessoa p) {
    if (arvore == null || arvore.rootNode == null || p == null) {
      return false;
    }

    if (arvore.rootNode.value.nrBI == p.nrBI && arvore.rootNode.value.nome.equals(p.nome)) {
      return true;
    }

    if (p.nrBI < arvore.rootNode.value.nrBI) {
      return procurarPessoa(new Arvore(arvore.rootNode.left), p);
    }
    else {
      return procurarPessoa(new Arvore(arvore.rootNode.right), p);
    }
  }
}
