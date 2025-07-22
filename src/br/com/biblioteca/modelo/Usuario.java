package br.com.biblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nomeUsuario;
    private String cpf;
    private List<Livro> livrosEmprestados;

    public Usuario(String nomeUsuario, String cpf) {
        setNomeUsuario(nomeUsuario);
        setCpf(cpf);
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        if (nomeUsuario == null || nomeUsuario.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do usuário não pode ser nulo ou vazio");
        }
        this.nomeUsuario = nomeUsuario.trim();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser vazio.");
        }

        if(cpf.length() != 11){
            throw new IllegalArgumentException("CPF deve der apenas 11 digitos.");
        }
        this.cpf = cpf;

    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public String toString(){
        return "Usuário: " + nomeUsuario + ", CPF: " + cpf;
    }

}



