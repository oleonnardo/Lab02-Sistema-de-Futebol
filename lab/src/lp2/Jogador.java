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
public class Jogador extends Funcionario{
    private String posicao;
    private String perna;
    
    public Jogador(){}
    
    public Jogador(String nome, String cpf, double salario, String posicao, String perna) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.posicao = posicao;
        this.perna = perna;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPerna() {
        return perna;
    }

    public void setPerna(String perna) {
        this.perna = perna;
    }
}
