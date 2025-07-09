package br.com.biblioteca.modelo;

public class LivroDigital extends Livro{
    private double tamanhoArquivoEmMb;


    public LivroDigital (String titulo, String autor, Categoria categoriaLivro){
        super(titulo, autor, categoriaLivro);
    }

    //all args constructor
    public LivroDigital(String titulo, String autorDoLivro, Categoria categoriaLivro, double tamanhoArquivoEmMb) {
        super(titulo, autorDoLivro, categoriaLivro);
        this.tamanhoArquivoEmMb = tamanhoArquivoEmMb;
    }

    public double getTamanhoArquivoEmMb() {
        return tamanhoArquivoEmMb;
    }

    public void setTamanhoArquivoEmMb(double tamanhoArquivoEmMb) {
        this.tamanhoArquivoEmMb = tamanhoArquivoEmMb;
    }
}
