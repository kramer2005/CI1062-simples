public class IOObject {
  String nome;

  IOObject(String nome){
    this.nome = nome;
  }

  void printName(){
    System.out.println(this.nome);
  }

  void printName(String path){
    System.out.println(path + this.nome);
  }
}
