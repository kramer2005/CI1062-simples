public class Arquivo extends IOObject {
  String extensao;
  String tipo;
  private int tamanho;
  private String conteudo;
  
  Arquivo(String nome, String tipo){
    super(nome);
    String[] partes = nome.split("\\.");
    this.extensao = partes[partes.length -1];
    this.tamanho = 0;
    this.tipo = tipo;
  }

  void printNomeTipo(){
    System.out.println(this.nome + " - " + this.tipo);
  }

  void printNomeTipo(String path){
    System.out.println(path + this.nome + " - " + this.tipo);
  }

  void setConteudo(String conteudo){
    this.conteudo = conteudo;
    this.tamanho = conteudo.length();
  }

  String getConteudo(){
    return this.conteudo;
  }

  int getTamanho(){
    return this.tamanho;
  }
}
