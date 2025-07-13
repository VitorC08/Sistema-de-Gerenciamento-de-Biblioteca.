package br.com.biblioteca.modelo;

import br.com.biblioteca.interfaces.Emprestavel;

public class LivroFisico extends Livro implements Emprestavel {
    private String editora;
    private int numeroDePaginas;
    private boolean isDiponivel = true;

    // all args constructor
    public LivroFisico(String titulo, String autor, Categoria categoriaLivro, String editora, int numerDePaginas) {
        super(titulo, autor, categoriaLivro);
        this.editora = editora;
        this.numeroDePaginas = numerDePaginas;
    }

    public String getEditora() {return editora;}

    public void setEditora(String editora) {this.editora = editora;}

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
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
