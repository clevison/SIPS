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
public class Selecao extends Programa{
    
   // private Programa programa;
    private int id_selecao;
    private String nome;
    private String descricao;
    private String dt_inicio;
    private String dt_fim;

     public Selecao(){
     
     }
             
    public Selecao(Programa prograna){
        this.setId(prograna.getId());
    }
    
    @Override
    public int getId() {
            return id_selecao;
    }
    public void setID(int id_selecao) {
            this.id_selecao = id_selecao;
    }
    @Override
    public String getNome() {
            return nome;
    }
    @Override
    public void setNome(String nome) {
            this.nome = nome;
    }
    @Override
    public String getDescricao() {
            return descricao;
    }
    @Override
    public void setDescricao(String descricao) {
            this.descricao = descricao;
    }
    public String getDt_inicio() {
            return dt_inicio;
    }
    public void setDt_inicio(String dt_inicio) {
            this.dt_inicio = dt_inicio;
    }
    public String getDt_fim() {
            return dt_fim;
    }
    public void setDt_fim(String dt_fim) {
            this.dt_fim = dt_fim;
    }
}
