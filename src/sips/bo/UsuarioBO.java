/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.bo;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sips.dao.UsuarioDAO;
import sips.model.Usuario;

/**
 *
 * @author Clevisobn
 */
public class UsuarioBO{
    public boolean cadastrarUsuario(String matricula, String nome,  String cpf, String senha,int qtd_familia, double rendaFamiliar) throws SQLException{
        
        
        
        if (validarEntradas(matricula, nome, cpf, senha)) {
            try {
               //Cria o Usuario
               Usuario u = new Usuario();
               u.setMatricula(matricula);
               u.setCpf(cpf);
               u.setNome(nome);
               u.setTipo_usuario(1);
               u.setSenha(senha);
               u.setQtd_familia(qtd_familia);
               u.setRenda_familiar(rendaFamiliar);

               UsuarioDAO uDAO = new UsuarioDAO();
               uDAO.insert(u);
               return true;
            } catch (Exception e) {
                return false;
            }           
        }else{
            return false;
        }
        
    }
    
    public boolean validarEntradas(String matricula, String nome,  String cpf, String senha){
        if (matricula.length() > 0 && nome.length() > 0 && cpf.length() > 0 && senha.length()> 0) {
            return true;
        }else{
             JOptionPane.showMessageDialog(null, "Dados invalidos!");
            return false;
        }
    }

}
