/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

/**
 *
 * @author Leonardo
 */
public class Estadio {
    
    private String nome;
    private String cidade;
    private String estado;
    int quantideTimes = 0;
    private Clube times[] = new Clube[10];
    
    public Estadio(String nome, String cidade, String estado) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Clube[] getTimes() {
        return times;
    }

    public void setTimes(Clube time) {
        this.times[this.quantideTimes] = time;
        this.quantideTimes++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    int getQuantideTimes() {
        return this.quantideTimes;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
