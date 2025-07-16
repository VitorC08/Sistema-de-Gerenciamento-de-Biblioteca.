package br.com.biblioteca.modelo;

public class LivroDigital extends Livro{
    private double tamanhoArquivoEmMb;
    private String formatoArquivo;


    //all args constructor
    public LivroDigital(String titulo, String autor, Categoria categoriaLivro, double tamanhoArquivoEmMb, String formatoArquivo ) {
        super(titulo, autor, categoriaLivro);
        this.tamanhoArquivoEmMb = tamanhoArquivoEmMb;
        this.formatoArquivo = formatoArquivo;
    }

    public double getTamanhoArquivoEmMb() {
        return tamanhoArquivoEmMb;
    }

    public void setTamanhoArquivoEmMb(double tamanhoArquivoEmMb) {
        this.tamanhoArquivoEmMb = tamanhoArquivoEmMb;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Livro Digital" +
                "\nFormato do arquivo: " + getFormatoArquivo() + "MB" +
                "\nTamanho do arquivo em Mb: " + getTamanhoArquivoEmMb() +
                "\n";
    }
}
