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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sips.model.Programa;

/**
 *
 * @author clevison.santana
 */
public class ProgramaDAO{
    
    ConexaoMySQL conexao = new ConexaoMySQL();

    public int insert(Programa programa) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "INSERT INTO programa(nome, valor, descricao) VALUES (" 
                   + "'" + programa.getNome()+ "', " + "'" + programa.getValor() + "',"+ " '" + programa.getDescricao()+ "')";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }       
    
    public int update(Programa programa) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "UPDATE programa SET nome='" + programa.getNome()+ "', " + "valor = '" + programa.getValor()+ "'," +   "descricao='" + programa.getDescricao()+"'"
                    + " WHERE id_programa = '" + programa.getId()+"'";
            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }    
    
    public int delete(int id) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "DELETE FROM programa  WHERE id_programa = '" + id +"'";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }    
    
     public boolean isExisteDado(String nome) throws SQLException {
        Statement stmt;
        ResultSet rs;
        try {
            String exe = "select * FROM   programa WHERE nome = '" + nome +"'";
            PreparedStatement pstm = conexao.conexaoMySQL().prepareStatement(exe);
//            System.out.println(exe);
            rs = pstm.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }
     
    public ArrayList<Programa> listarProgramas() {
        ResultSet rs;
        PreparedStatement pstm;
        ArrayList<Programa> programas = new ArrayList<>();
        try {
            pstm = conexao.conexaoMySQL().prepareStatement("SELECT * FROM programa");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Programa programa = new Programa();
//                programa.setId(Integer.parseInt(rs.getString("id_programa")));
                programa.setNome(rs.getString("nome"));
                programa.setValor(Double.parseDouble(rs.getString("valor")));
                programa.setDescricao(rs.getString("descricao"));
                programas.add(programa);
            }
            return programas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar programas");
        }
        return programas;
    }
}
