/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.bo;

import java.sql.SQLException;

/**
 *
 * @author Junior
 */
public interface IAutenticavel {
    public int logar(String matricula, String senha) throws SQLException;
}
