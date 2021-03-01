import java.util.ArrayList;

public class Pasta extends IOObject {
  ArrayList<IOObject> filhos;

  /**
   * Método construtor
   * 
   * @param nome - Nome da pasta
   */
  Pasta(String nome) {
    super(nome);
    this.filhos = new ArrayList<IOObject>();
  }

  /**
   * Adiciona um filho à pasta
   * 
   * @param filho - filho a ser adicionado
   */
  void addFilho(IOObject filho) {
    this.filhos.add(filho);
  }

  /**
   * Imprime os filhos com o tipo
   */
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

  /**
   * Imprime os filhos com o tipo e o caminho até o arquivo
   * 
   * @param path - Caminho do pai
   */
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

  /**
   * Imprime os arquivos de determinado tipo
   * 
   * @param tipo - Tipo de arquivo a ser impresso
   */
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

  /**
   * Imprime os arquivos de determinado tipo e o caminho até o arquivo
   * 
   * @param tipo - Tipo de arquivo a ser impresso
   * @param path - Caminho até o arquivo a ser impresso
   */
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