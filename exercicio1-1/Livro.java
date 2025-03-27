import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    String editora;
    int numeroPaginas;
    int paginaAtual;

    public Livro(String titulo, String autor, String editora, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        this.paginaAtual = 0;
    }

    public void virarPagina() {
        if (paginaAtual < numeroPaginas) {
            paginaAtual++;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Página atual: " + paginaAtual);
    }
}





public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o título do livro: ");
        String titulo = sc.nextLine();
        System.out.print("Informe o autor: ");
        String autor = sc.nextLine();
        System.out.print("Informe a editora: ");
        String editora = sc.nextLine();
        System.out.print("Informe o número de páginas: ");
        int numeroPaginas = sc.nextInt();
        Livro livro = new Livro(titulo, autor, editora, numeroPaginas);

        livro.virarPagina();

        livro.exibirInformacoes();

        sc.close();
    }
}
