/**
 * O tipo IOObject, generalização de Arquivo e Pasta
 */
public class IOObject {
  String nome;

  /**
   * Método construtor
   * @param nome - o nome do arquivo
   */
  IOObject(String nome){
    this.nome = nome;
  }

  /**
   * Imprime o nome do arquivo
   */
  void printNome(){
    System.out.println(this.nome);
  }

  /**
   * Imprime o nome do arquivo com o caminho do pai
   * @param path - Caminho do pai
   */
  void printNome(String path){
    System.out.println(path + this.nome);
  }
}
