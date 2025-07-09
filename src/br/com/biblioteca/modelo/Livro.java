package br.com.biblioteca.modelo;

public abstract class Livro {
    private String titulo;
    private String autor;
    private Categoria categoriaLivro;

    public Livro(String titulo, String autorDoLivro, Categoria categoriaLivro) {
        this.titulo = titulo;
        this.autor = autorDoLivro;
        this.categoriaLivro = categoriaLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Categoria getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(Categoria categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }
}
