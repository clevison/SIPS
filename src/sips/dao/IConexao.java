/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author clevi
 */
public interface IConexao {
      Connection getConexao(String tipoBanco, String endereco, String nomeBanco, String nomeUsuario, String senha) throws SQLException;
}
