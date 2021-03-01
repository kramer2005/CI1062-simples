class Programa {
  public static void main(String[] args) {
    Pasta pasta = new Pasta("pai");
    Pasta filho = new Pasta("filho");
    pasta.addFilho(filho);
    pasta.printTree();
  }
}