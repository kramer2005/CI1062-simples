public class Arquivo extends IOObject {
  String extensao;
  int tamanho;
  String tipo;
  Arquivo(String nome, String tipo){
    super(nome);
    String[] partes = nome.split(".");
    this.extensao = partes[partes.length - 1];
    this.tamanho = 0;
    this.tipo = tipo;
  }
}
