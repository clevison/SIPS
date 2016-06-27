/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.bo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junior
 */
public class UsuarioBOTest {
    
    UsuarioBO user;
    public UsuarioBOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        user = new UsuarioBO();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validarEntradas method, of class UsuarioBO.
     */
    @Test
    public void testValidarEntradasOK() {
        System.out.println("cadastrarUsuario");
        String matricula = "123456789";
        String nome = "José";
        String cpf = "12345678912";
        String senha = "12345";
        UsuarioBO instance = new UsuarioBO();
        boolean expResult = true;
        boolean result = instance.validarEntradas(matricula, nome, cpf, senha);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarEntradasNaoOK() {
        System.out.println("cadastrarUsuario");
        String matricula = "123456789";
        String nome = null;
        String cpf = "12345678912";
        String senha = "";
        UsuarioBO instance = new UsuarioBO();
        boolean expResult = false;
        boolean result = instance.validarEntradas(matricula, nome, cpf, senha);
        assertEquals(expResult, result);
    }
    
}
