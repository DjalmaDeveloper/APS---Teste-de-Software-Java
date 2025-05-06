package com.example.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    void testConstrutorEGetters() {
        Usuario usuario = new Usuario("João", "joao@test.com", "senha123");
        assertEquals("João", usuario.getNome());
        assertEquals("joao@test.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
    }

    @Test
    void testSetters() {
        Usuario usuario = new Usuario("João", "joao@empresa.com", "senha123");
        usuario.setNome("João Silva");
        usuario.setEmail("joaosilva@empresa.com");
        usuario.setSenha("novaSenha123");
        assertEquals("João Silva", usuario.getNome());
        assertEquals("joaosilva@empresa.com", usuario.getEmail());
        assertEquals("novaSenha123", usuario.getSenha());
    }

    @Test
    void testeEqualsMesmoEmail() {
        Usuario usuario1 = new Usuario("João Silva", "joao@empresa.com", "senha123");
        Usuario usuario2 = new Usuario("João Paulo", "joao@empresa.com", "senha456");
        assertEquals(usuario1, usuario2);
    }

    @Test
    void testEqualsEmailDiferente() {
        Usuario usuario1 = new Usuario("João", "joao@empresa.com", "senha123");
        Usuario usuario2 = new Usuario("João", "joaopaulo@empresa.com", "senha123");
        assertNotEquals(usuario1, usuario2);
    }

    @Test
    void testHashCodeComMesmoEmail() {
        Usuario usuario1 = new Usuario("André Silva", "andre@ex.com", "senha123");
        Usuario usuario2 = new Usuario("André Costa", "andre@ex.com", "senha456");
        assertEquals(usuario1.hashCode(), usuario2.hashCode());
    }

    @Test
    void testHashCodeComEmailDiferente() {
        Usuario usuario1 = new Usuario("Ana", "ana@ex.com", "senha123");
        Usuario usuario2 = new Usuario("Ana", "aninha@ex.com", "senha123");
        assertNotEquals(usuario1.hashCode(), usuario2.hashCode());
    }

    @Test
    void testEqualsComObjetoNuloOuOutroTipo() {
        Usuario usuario = new Usuario("Carlos", "carlos@empresa.com", "senha123");
        assertNotEquals(null, usuario);
        assertNotEquals("Texto aleatório", usuario);
    }
}
