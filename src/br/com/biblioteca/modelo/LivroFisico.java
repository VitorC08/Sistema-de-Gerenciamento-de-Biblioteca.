package br.com.biblioteca.modelo;

import br.com.biblioteca.interfaces.Emprestavel;

public class LivroFisico extends Livro implements Emprestavel {
    private String editora;
    private int numerDePaginas;
    private boolean isDiponivel = true;

    public LivroFisico (String titulo, String autor, Categoria categoriaLivro){
        super(titulo, autor, categoriaLivro);
    }

    // all args constructor
    public LivroFisico(String titulo, String autorDoLivro, Categoria categoriaLivro, String editora, int numerDePaginas, boolean isDiponivel) {
        super(titulo, autorDoLivro, categoriaLivro);
        this.editora = editora;
        this.numerDePaginas = numerDePaginas;
        this.isDiponivel = isDiponivel;
    }

    public String getEditora() {return editora;}

    public void setEditora(String editora) {this.editora = editora;}

    public int getNumerDePaginas() {
        return numerDePaginas;
    }

    public void setNumerDePaginas(int numerDePaginas) {
        this.numerDePaginas = numerDePaginas;
    }

    @Override
    public void emprestar(Usuario usuario) {
        if(!isDiponivel){
            System.out.println("O livro " + getTitulo() + " não está disponivel no momento");
        } else {
            System.out.println(usuario.getNomeUsuario() + "pegou o livro " + getTitulo() + "emprestado.");
            isDiponivel = false;
        }
    }

    @Override
    public void devolver() {
        System.out.println("O livro " + getTitulo() + "foi devolvido.");
        isDiponivel = true;
    }
}
