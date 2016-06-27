/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sips.dao.ProgramaDAO;
import sips.model.Programa;

/**
 *
 * @author NeftaliJunior
 */
public class ProgramaBO{
    
    public boolean criarPrograma(String nome, double valor, String descricao) throws SQLException{
        
        if (validarEntradas(nome, valor, descricao)) {
            try {
               //Cria o Programa
               Programa prog = new Programa();
               prog.setNome(nome);
               prog.setValor(valor);
               prog.setDescricao(descricao);

               ProgramaDAO progDAO = new ProgramaDAO();
                progDAO.insert(prog);
               return true;
            } catch (Exception e) {
                return false;
            }           
        }else{
            return false;
        }
        
    }
    
    public boolean validarEntradas(String nome, double valor, String descricao){
        if (nome.length() > 0 && valor > 0 && descricao.length() > 0) {
            return true;
        }else{
             JOptionPane.showMessageDialog(null, "Dados invalidos!");
            return false;
        }
    }
    public ArrayList<Programa> listarProgramas(){
        ProgramaDAO progDao =  new ProgramaDAO();
        return progDao.listarProgramas();
    }
    
}
