public class Arquivo extends IOObject {
  String extensao;
  String tipo;
  private int tamanho;
  private String conteudo;

  /**
   * Método construtor
   * 
   * @param nome - Nome com extensão
   * @param tipo - Tipo do arquivo, podendo ser a principio texto, imagem ou pdf
   */
  Arquivo(String nome, String tipo) {
    super(nome);
    String[] partes = nome.split("\\.");
    if (partes.length > 1) {
      this.extensao = partes[partes.length - 1];
    } else {
      this.extensao = "";
    }
    this.tamanho = 0;
    this.tipo = tipo;
  }

  /**
   * Imprime o nome do arquivo com o tipo
   */
  void printNomeTipo() {
    System.out.println(this.nome + " - " + this.tipo);
  }

  /**
   * Imprime o nome do arquivo com o caminho e tipo
   * 
   * @param path - Caminho da pasta pai
   */
  void printNomeTipo(String path) {
    System.out.println(path + this.nome + " - " + this.tipo);
  }

  /**
   * Setter para o conteúdo, importante usar setter e getter pois o tamanho do
   * arquivo é igual ao tamanho do conteúdo
   * 
   * @param conteudo - Conteúdo novo
   */
  void setConteudo(String conteudo) {
    this.conteudo = conteudo;
    this.tamanho = conteudo.length();
  }

  /**
   * Getter para o conteúdo
   * 
   * @return - Retorna o conteúdo
   */
  String getConteudo() {
    return this.conteudo;
  }

  /**
   * Getter para o tamanho do arquivo
   * 
   * @return - Retorna o tamanho do arquivo
   */
  int getTamanho() {
    return this.tamanho;
  }
}
