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

  void printFilhos() {
    System.out.println(this.nome + "/" + " - Pasta");
    for (int i = 0; i < this.filhos.size(); i++) {
      IOObject filho = filhos.get(i);
      if (filho instanceof Pasta) {
        ((Pasta) filho).printFilhos(this.nome + "/");
      } else {
        ((Arquivo) filho).printNomeTipo(this.nome + "/");
      }
    }
  }

  void printFilhos(String path) {
    System.out.println(path + this.nome + "/" + " - Pasta");
    for (int i = 0; i < this.filhos.size(); i++) {
      IOObject filho = filhos.get(i);
      if (filho instanceof Pasta) {
        ((Pasta) filho).printFilhos(path + this.nome + "/");
      } else {
        ((Arquivo) filho).printNomeTipo(path + this.nome + "/");
      }
    }
  }

  void printFilhosTipo(String tipo) {
    for (int i = 0; i < this.filhos.size(); i++) {
      IOObject filho = filhos.get(i);
      if (filho instanceof Pasta) {
        ((Pasta) filho).printFilhosTipo(tipo, this.nome + "/");
      } else {
        if (((Arquivo) filho).tipo == tipo) {
          filho.printNome(this.nome + "/");
        }
      }
    }
  }

  void printFilhosTipo(String tipo, String path) {
    for (int i = 0; i < this.filhos.size(); i++) {
      IOObject filho = filhos.get(i);
      if (filho instanceof Pasta) {
        ((Pasta) filho).printFilhosTipo(tipo, path + this.nome + "/");
      } else {
        if (((Arquivo) filho).tipo == tipo) {
          filho.printNome(path + this.nome + "/");
        }
      }
    }
  }

}