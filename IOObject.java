public class IOObject {
  String nome;

  IOObject(String nome){
    this.nome = nome;
  }

  void printNome(){
    System.out.println(this.nome);
  }

  void printNome(String path){
    System.out.println(path + this.nome);
  }
}
