
package com.example.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidacoesTest {
    @Test
    void testEmailValido() {
        assertTrue(Validacoes.emailValido("teste@ex.com"));
        assertFalse(Validacoes.emailValido("invalid"));
        assertFalse(Validacoes.emailValido(null));
        assertFalse(Validacoes.emailValido(""));
        assertFalse(Validacoes.emailValido("teste.ex.com"));
        assertFalse(Validacoes.emailValido("teste@@ex.com"));
    }

    @Test
    void testSenhaForte() {
        assertTrue(Validacoes.senhaForte("Abcdef1g"));
        assertFalse(Validacoes.senhaForte("weak"));
        assertFalse(Validacoes.senhaForte(null));
        assertFalse(Validacoes.senhaForte("abc12345"));
        assertFalse(Validacoes.senhaForte("ABC12345"));
        assertFalse(Validacoes.senhaForte("Abcdefgh"));
        assertFalse(Validacoes.senhaForte("ABCDEFGH"));
    }

    @Test
    void testNomeValido() {
        assertTrue(Validacoes.nomeValido("João Silva"));
        assertFalse(Validacoes.nomeValido("12345"));
        assertFalse(Validacoes.nomeValido(null));
        assertFalse(Validacoes.nomeValido(""));
        assertFalse(Validacoes.nomeValido("   "));
        assertFalse(Validacoes.nomeValido("João@Silva"));
    }
}
