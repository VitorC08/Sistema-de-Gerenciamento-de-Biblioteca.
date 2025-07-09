package br.com.biblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nomeUsuario;
    private String cpf;
    private List<Livro> livrosEmprestados;

    public Usuario(String nomeUsuario, String cpf) {
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser vazio");
        } else {
            this.cpf = cpf;
        }
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public String toString(){
        return "Usuário: " + nomeUsuario + ", CPF: " + cpf;
    }
}



