/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sips.bo.IAutenticavel;

/**
 *
 * @author clevison.santana
 */
public class LoginDAO implements IAutenticavel{
    ConexaoMySQL conexao = new ConexaoMySQL();
    @Override
    public int logar(String matricula, String senha) throws SQLException {
        ResultSet rs;
        int tipoUsuario;
        
        try {
            String exe = "select * FROM usuario  WHERE matricula='"+ matricula +"' AND senha='"+senha + "'";
            PreparedStatement pstm = conexao.conexaoMySQL().prepareStatement(exe);
//            System.out.println(exe);
            rs = pstm.executeQuery();
           
            if (rs.first()) {
                tipoUsuario = rs.getInt("tipo_usuario");
                return tipoUsuario;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }
}
