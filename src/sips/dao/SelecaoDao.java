/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.dao;

import java.sql.SQLException;
import java.sql.Statement;
import sips.model.Selecao;

/**
 *
 * @author clevison.santana
 */
public class SelecaoDao extends ProgramaDAO{

    public int insert(Selecao selecao) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "INSERT INTO selecao(id_programa, nome, descricao, dt_inicio, dt_termino) VALUES (" 
                    + "'" + selecao.getId()+ "', " + "'" + selecao.getNome()+ "'," + "'" + selecao.getDescricao()+ "'," 
                  + "'" + selecao.getDt_inicio()+ "', "  + " '" + selecao.getDt_fim()+ "')";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }       
    
    public int update(Selecao selecao) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "UPDATE selecao SET nome='" + selecao.getNome()+ "', " + "descricao = '" + selecao.getDescricao()+ "',"  
                    + "dt_inicio = '" + selecao.getDt_inicio()+ "'," +  "dt_termino='" + selecao.getDt_fim()+"'"
                    + " WHERE id_programa = '" + selecao.getId()+"'";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }    
    @Override
    public int delete(int id) throws SQLException {
        Statement stmt;
        try {
            stmt = conexao.conexaoMySQL().createStatement();
            String exe = "DELETE FROM selecao  WHERE id_programa = '" + id +"'";
//            System.out.println(exe);
            stmt.executeUpdate(exe);
            return 1;
        } catch (SQLException e) {
            throw new SQLException("Erro: " + e.getMessage());
        }
    }    
}
