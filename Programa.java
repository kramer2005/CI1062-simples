/**
 * @author Wagner J. Kramer Vieira
 */

class Programa {
  public static void main(String[] args) {
    // Cria pasta root
    Pasta root = new Pasta("root");

    //Cria pastas texto, imagens e pdfs
    Pasta textos = new Pasta("texto");
    Pasta imagens = new Pasta("imagens");
    Pasta pdfs = new Pasta("pdfs");

    // Adiciona 3 arquivos de cada tipo às suas respectivas pastas
    for (int i = 0; i < 3; i++) {
      textos.addFilho(new Arquivo(String.format("texto-%d.txt", i), "texto"));
      imagens.addFilho(new Arquivo(String.format("imagem-%d.jpg", i), "imagem"));
      pdfs.addFilho(new Arquivo(String.format("pdf-%d.pdf", i), "pdf"));
    }

    // Adiciona as pastas à pasta root
    root.addFilho(textos);
    root.addFilho(imagens);
    root.addFilho(pdfs);

    // Imprime todas as pastas e arquivos com tipo
    System.out.println("\n====================================================================\n");
    System.out.println("Imprimindo todas as pastas e arquivos (com tipo junto para facilitar\n");
    System.out.println("====================================================================\n");
    root.printFilhos();

    // Imprime todos os arquivos de texto
    System.out.println("\n=====================================\n");
    System.out.println("Imprimindo todos os arquivos de texto\n");
    System.out.println("=====================================\n");

    root.printFilhosTipo("texto");
  }
}