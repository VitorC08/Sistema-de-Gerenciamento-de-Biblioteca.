package br.com.biblioteca.servico;

import br.com.biblioteca.modelo.Livro;
import br.com.biblioteca.modelo.LivroFisico;
import br.com.biblioteca.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Usuario> usuarios;
    private List<Emprestimo> historicoDeEmprestimos;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.historicoDeEmprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro){
        if(livro == null){
            System.out.println("Livro não pode ser nulo !");
        } else {
            acervo.add(livro);
            System.out.println("Livro " + livro.getTitulo() + " adicionado ao acervo.");
        }
    }

    public void registrarUsuario(Usuario usuario){
        if(usuario == null){
            System.out.println("Usuário não pode ser nulo");
        } else {
            usuarios.add(usuario);
            System.out.println("Usuário: " + usuario.getNomeUsuario() + " registrado.");
        }
    }

    public void listarLivrosDisponiveis(){
        if(acervo.isEmpty()){
            System.out.println("O acervo está vazio.");
            return;
        }

        System.out.println("=== Livros Cadastrados ===");
        for (Livro livro : acervo){
            System.out.println(livro);
        }
    }

    public boolean registrarEmprestimo(String cpfUsuario, String tituloLivro){
        Usuario usuario = findUsuarioByCpf(cpfUsuario);
        if(usuario == null){
            System.out.println("Usuário com cpf " + cpfUsuario + " não encontrado no sistema");
            return false;
        }

        Livro livro = findLivroByTitulo(tituloLivro);
        if(livro == null){
            System.out.println("Livro com o titulo " + tituloLivro + " não encontrado.");
        }

        if(!livro.isDisponivel()){
            System.out.println(" O livro " + livro.getTitulo() + " já está emprestado.");
            return false;
        }

        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        historicoDeEmprestimos.add(emprestimo);
        livro.setDisponivel(false);

        System.out.println("Emprestimo realizado com sucesso !");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuário: " + usuario.getNomeUsuario());
        System.out.println("Data: " + emprestimo.getDataEmprestimo());

        return true;
    }

    public void devolverLivro(LivroFisico livroFisico){
        if(!acervo.contains(livroFisico)){
            System.out.println("Esse livro não faz parte do nosso acervo");
            return;
        }

        livroFisico.devolver();
        System.out.println("Livro devolvido com sucesso !");
    }

    public Usuario findUsuarioByCpf(String cpf){
        return usuarios.stream()
                .filter(u-> u.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public Livro findLivroByTitulo(String titulo){
        return acervo.stream()
                .filter(a -> a.getTitulo().equals(titulo))
                .findFirst()
                .orElse(null);
    }
}
