package br.com.biblioteca.interfaces;

import br.com.biblioteca.modelo.Usuario;

public interface Emprestavel {
    void emprestar (Usuario usuario);
    void devolver();
}
