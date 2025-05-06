
package com.example.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroTest {
    @Test
    void testCadastrarUsuarioValido() {
        Usuario u = Cadastro.cadastrarUsuario("João", "joao@empresa.com", "Senha123");
        assertNotNull(u);
        assertEquals("joao@empresa.com", u.getEmail());
    }

    @Test
    void testAtualizarUsuarioValido(){
        Usuario u = Cadastro.cadastrarUsuario("André", "andre@ex.com", "Senha123");
        assertTrue(Cadastro.atualizarUsuario(u, "André Silva", "andre@ex.com", "NovaSenha123"));
        assertEquals("André Silva", u.getNome());
    }

    @Test
    void testAlterarParcialNome(){
        Usuario u = Cadastro.cadastrarUsuario("Carlos", "carlos@dominio.com", "Senha123");
        assertTrue(Cadastro.alterarParcial(u, "nome", "Carlos Silva"));
        assertEquals("Carlos Silva", u.getNome());
    }

    @Test
    void testAlterarParcialCampoInvalido(){
        Usuario u = Cadastro.cadastrarUsuario("Ana", "ana@campo.com", "Senha123");
        assertFalse(Cadastro.alterarParcial(u, "idade", "25"));
    }

    @Test
    void testExcluirUsuario() {
        Usuario u = Cadastro.cadastrarUsuario("Maria", "maria@empresa.com", "Senha123");
        assertTrue(Cadastro.excluirUsuario(u));
        assertFalse(Cadastro.excluirUsuario(u));
    }

    @Test
    void testCadastroFunc0() {
        assertEquals("CADASTRO_0", Cadastro.cadastroFunc0());
    }

    @Test
    void testCadastroFunc1() {
        assertEquals("CADASTRO_1", Cadastro.cadastroFunc1());
    }
}
