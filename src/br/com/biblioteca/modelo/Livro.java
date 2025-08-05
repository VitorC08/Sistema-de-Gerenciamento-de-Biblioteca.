package br.com.biblioteca.modelo;

public abstract class Livro {
    private String titulo;
    private String autor;
    private Categoria categoriaLivro;
    private boolean disponivel;

    public Livro(String titulo, String autor, Categoria categoriaLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoriaLivro = categoriaLivro;
        this.disponivel = true;
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nCategoria: " + getCategoriaLivro() +
                "\nDisponível: " + (isDisponivel() ? "Sim" : "Não");
    }
}
