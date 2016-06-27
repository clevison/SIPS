/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.bo;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sips.dao.SelecaoDao;
import sips.model.Selecao;

/**
 *
 * @author Junior
 */
public class SelecaoBO {
    public boolean criarSelecao(String nome, String descricao, String dt_inicio, String dt_fim) throws SQLException{
        if (validarEntradas(nome, descricao, dt_inicio, dt_fim)) {
            try {
               //Cria o Selecao
               Selecao sel = new Selecao();
               sel.setNome(nome);
               sel.setDescricao(descricao);
               sel.setDt_inicio(dt_inicio);
               sel.setDt_fim(dt_fim);
               
               SelecaoDao selDAO = new SelecaoDao();
               selDAO.insert(sel);
               return true;
            } catch (Exception e) {
                return false;
            }           
        }else{
            return false;
        }
        
    }
    
    public boolean validarEntradas(String nome, String descricao, String dt_inicio, String dt_fim){
        if (nome.length() > 0 && descricao.length() > 0 && dt_inicio.length()> 0 && dt_fim.length()> 0) {
            return true;
        }else{
             JOptionPane.showMessageDialog(null, "Dados invalidos ou imcompletos!");
            return false;
        }
    }
    
}
