/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sips.model;

/**
 *
 * @author clevison.santana
 */
public class Usuario {
    private String matricula;
    private String nome;
    private String cpf;
    private int tipo_usuario;
    private String senha;
    private int qtd_familia;
    private double renda_familiar;
    public String getMatricula() {
            return matricula;
    }
    public void setMatricula(String matricula) {
            this.matricula = matricula;
    }
    public String getNome() {
            return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }

    public String getCpf() {
            return cpf;
    }
    public void setCpf(String cpf) {
            this.cpf = cpf;
    }
    public int getTipo_usuario() {
            return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
            this.tipo_usuario = tipo_usuario;
    }
    public String getSenha() {
            return senha;
    }
    public void setSenha(String senha) {
            this.senha = senha;
    }
    public int getQtd_familia() {
            return qtd_familia;
    }

    public void setQtd_familia(int qtd_familia) {
            this.qtd_familia = qtd_familia;
    }
    public double getRenda_familiar() {
            return renda_familiar;
    }
    public void setRenda_familiar(double renda_familiar) {
            this.renda_familiar = renda_familiar;
    }
}
