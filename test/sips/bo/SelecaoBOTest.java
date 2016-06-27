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
public class SelecaoBOTest {
    
    SelecaoBO sel;
    public SelecaoBOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sel = new SelecaoBO();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of criarSelecao method, of class SelecaoBO.
     */
   /* @Test
    public void testCriarSelecao() throws Exception {
        System.out.println("criarSelecao");
        String nome = "";
        String descricao = "";
        String dt_inicio = "";
        String dt_fim = "";
        SelecaoBO instance = new SelecaoBO();
        boolean expResult = false;
        boolean result = instance.criarSelecao(nome, descricao, dt_inicio, dt_fim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of validarEntradas method, of class SelecaoBO.
     */
    @Test
    public void testValidarEntradasOK() {
        System.out.println("validarEntradas");
        
        String nome = "Transporte 20162";
        String descricao = "Alunos do Ensino superior e medio";
        String dt_inicio = "02/08/2016";
        String dt_fim = "02/12/2016";
        SelecaoBO instance = new SelecaoBO();
        boolean expResult = true;
        boolean result = instance.validarEntradas(nome, descricao, dt_inicio, dt_fim);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarEntradasNaoOK() {
        String nome = "Transporte 20162";
        String descricao = "Alunos do Ensino superior e medio";
        String dt_inicio = "02/08/2016";
        String dt_fim = "";
        SelecaoBO instance = new SelecaoBO();
        boolean expResult = false;
        boolean result = instance.validarEntradas(nome, descricao, dt_inicio, dt_fim);
        assertEquals(expResult, result);
    }
    
}
