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

    // TODO: implementar metodo para listar livros disponiveis apos o cadastro;
    public void listarLivrosDisponiveis(Livro livro){
    }

    public void registrarEmprestimo(Usuario usuario, LivroFisico livroFisico){
        if(!acervo.contains(livroFisico)){
            System.out.println("Esse livro não faz parte do nosso acervo.");
            return;
        }

        if (livroFisico.isDisponivel()){
            livroFisico.emprestar(usuario);
            historicoDeEmprestimos.add(new Emprestimo(livroFisico,usuario));
        }
    }

    public void devolverLivro(LivroFisico livroFisico){
        if(!acervo.contains(livroFisico)){
            System.out.println("Esse livro não faz parte do nosso acervo");
            return;
        }

        livroFisico.devolver();
        System.out.println("Livro devolvido com sucesso !");
    }
}
