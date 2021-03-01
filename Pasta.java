import java.util.ArrayList;

public class Pasta extends IOObject {
  ArrayList<IOObject> filhos;

  Pasta(String nome) {
    super(nome);
    this.filhos = new ArrayList<IOObject>();
  }

  void addFilho(IOObject filho) {
    this.filhos.add(filho);
  }

  void printTree() {
    System.out.println(this.nome);
    for (int i = 0; i < this.filhos.size(); i++) {
      IOObject filho = filhos.get(i);
      if (filho instanceof Pasta) {
        ((Pasta) filho).printTree(this.nome + "/");
      } else {
        filho.printName(this.nome + "/");
      }
    }
  }

  void printTree(String path) {
    System.out.println(path + this.nome);
    for (int i = 0; i < this.filhos.size(); i++) {
      IOObject filho = filhos.get(i);
      if (filho instanceof Pasta) {
        ((Pasta) filho).printTree(path + this.nome + "/");
      } else {
        filho.printName(path + this.nome + "/");
      }
    }
  }

  void printFilhosPorTipo(String tipo, String path) {
    if (tipo != null) {
      if (path != null) {
        System.out.println(this.nome);
        for (int i = 0; i < this.filhos.size(); i++) {
          IOObject filho = filhos.get(i);
          if (filho instanceof Pasta) {
            ((Pasta) filho).printFilhosPorTipo(tipo, this.nome + "/");
          } else {
            if (((Arquivo) filho).tipo == tipo) {
              filho.printName(path + this.nome + "/");
            }
          }
        }
      } else {

      }
    }

  }
}