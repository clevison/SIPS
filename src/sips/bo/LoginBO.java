/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.bo;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sips.dao.LoginDAO;
import sips.view.telaAluno;
import sips.view.telaAssistente;

/**
 *
 * @author clevi
 */
public class LoginBO implements IAutenticavel{

    @Override
    public int logar(String matricula, String senha) throws SQLException {
        
        if (validarLogin(matricula, senha)) {
             LoginDAO logDao =  new LoginDAO();
            int tipoUsuario = logDao.logar(matricula, senha);

            switch(tipoUsuario){
                case 1:
                    new telaAluno().setVisible(true);
                    break;
                case 2:
                    new telaAssistente().setVisible(true);
                    break;
                default:
                     JOptionPane.showMessageDialog(null, "Login inválido");
                    break;
            }
            return tipoUsuario;
        }
       return 0;
    }
   public boolean validarLogin(String matricula, String senha){
       if (matricula.length() > 0 && senha.length() > 0) {
           return true;
       }else{
            JOptionPane.showMessageDialog(null, "Dados de login incorretos");
            return false;
       }
   }
    
}
