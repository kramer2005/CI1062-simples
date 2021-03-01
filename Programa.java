/**
 * @author Wagner J. Kramer Vieira
 */

class Programa {
  public static void main(String[] args) {
    Pasta root = new Pasta("root");
    Pasta textos = new Pasta("texto");
    Pasta imagens = new Pasta("imagens");
    Pasta pdfs = new Pasta("pdfs");
    for (int i = 0; i < 3; i++) {
      textos.addFilho(new Arquivo(String.format("texto-%d.txt", i), "texto"));
      imagens.addFilho(new Arquivo(String.format("imagem-%d.jpg", i), "imagem"));
      pdfs.addFilho(new Arquivo(String.format("pdf-%d.pdf", i), "pdf"));
    }
    root.addFilho(textos);
    root.addFilho(imagens);
    root.addFilho(pdfs);
    System.out.println("====================================================================\n");
    System.out.println("Imprimindo todas as pastas e arquivos (com tipo junto para facilitar\n");
    System.out.println("====================================================================\n");
    root.printFilhos();

    System.out.println("\n=====================================\n");
    System.out.println("Imprimindo todos os arquivos de texto\n");
    System.out.println("=====================================\n");

    root.printFilhosTipo("texto");
  }
}