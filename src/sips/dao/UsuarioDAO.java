/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sips.model.Usuario;

/**
 *
 * @author clevison.santana
 */
public class UsuarioDAO {
    ConexaoMySQL conexao = new ConexaoMySQL();
    public UsuarioDAO() {
    }

    public int insert(Usuario usuario) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "INSERT INTO usuario(matricula, nome, cpf, tipo_usuario, senha,qtd_familia,renda_familia) VALUES (" 
                    + "'" + usuario.getMatricula()+ "', " + "'" + usuario.getNome() + "'," + "'" + usuario.getCpf() + "'," 
                    + " '" + usuario.getTipo_usuario()+ "'," + " '"  + usuario.getSenha()+ "'," + " '" + usuario.getQtd_familia()+ "'," + " '" + usuario.getRenda_familiar()+ "')";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }       
    
    public int update(Usuario usuario) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "UPDATE usuario SET nome = '" + usuario.getNome() + "'," + "cpf='" +  usuario.getCpf() + "'," 
                    + "'," + "tipo_usuario='" + usuario.getTipo_usuario() + "',"  + "qtd_familia='" + usuario.getQtd_familia()+"'," + "renda_familia='" + usuario.getRenda_familiar()+ "'"
                    + " WHERE matricula = '" + usuario.getMatricula()+"'";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }    
    
    public int delete(String matricula) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "DELETE FROM usuario  WHERE matricula = '" + matricula +"'";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }    
    
     public boolean isExisteDado(String nomeCampo,int dado) throws SQLException {
        Statement stmt;
        ResultSet rs;
        try {
            String exe = "select * FROM usuario  WHERE "+ nomeCampo + "= '" + dado +"'";
            PreparedStatement pstm = conexao.conexaoMySQL().prepareStatement(exe);
//            System.out.println(exe);
            rs = pstm.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }         
}
