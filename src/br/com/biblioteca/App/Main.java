package br.com.biblioteca.App;

import br.com.biblioteca.modelo.LivroDigital;
import br.com.biblioteca.servico.Biblioteca;
import br.com.biblioteca.modelo.LivroFisico;
import br.com.biblioteca.modelo.Categoria;
import br.com.biblioteca.modelo.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== Menu de Gerenciamento ====");
            System.out.println("1 - Cadastrar novo livro do acervo.");
            System.out.println("2 - Exibir livros cadastrados na biblioteca.");
            System.out.println("3 - Cadastrar um usuário.");
            System.out.println("4 - Registrar emprestimo de livros.");
            System.out.println("5 - Registrar devoluções de emprestimos.");
            System.out.println("6 - Exibir histório de emprestimos da biblioteca.");
            System.out.println("7 - Finalizar Sessão.");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1 :{
                    System.out.println("=== Cadastro de Livros ===");
                    System.out.println("1 - Cadastrar novo Livro Fisíco.");
                    System.out.println("2 - Cadastrar novo Livro Digital.");

                    int subopcao = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Titulo : ");
                    String titulo = scanner.nextLine();

                    System.out.println("Autor : ");
                    String autor = scanner.nextLine();

                    System.out.println("Categoria (FICCAO, CIENCIA, TECNOLOGIA, AUTOAJUDA, OUTROS");
                    String categoriaSelecionada = scanner.nextLine().toUpperCase();
                    Categoria categoriaLivro = Categoria.valueOf(categoriaSelecionada);

                    if (subopcao == 1){
                        System.out.println("Editora: ");
                        String editora = scanner.nextLine();

                        System.out.println("Numero de Páginas: ");
                        int numeroDePaginas = scanner.nextInt();

                        LivroFisico livro = new LivroFisico(titulo, autor, categoriaLivro, editora, numeroDePaginas);

                        biblioteca.cadastrarLivro(livro);

                    } else if (subopcao == 2) {
                        System.out.println("Tamanho em MB: ");
                        double tamanhoArquivoEmMb = scanner.nextDouble();

                        System.out.println("Formato do Arquivo: ");
                        String formatoArquivo = scanner.nextLine();

                        LivroDigital livro = new LivroDigital(titulo,autor,categoriaLivro,tamanhoArquivoEmMb,formatoArquivo);
                        biblioteca.cadastrarLivro(livro);
                    }
                    break;
                }

                case 2: {
                    biblioteca.listarLivrosDisponiveis();
                    break;
                }

            }
        } while(opcao != 8);
    }
}
