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
public class Partida {
    
    private Estadio estadio;
    private String data;
    private String hora;
    private Clube mandante;
    private Clube visitante;
    private Arbitro juizes[] = new Arbitro[5];
    int quantidadeArbitro=0;
    
    public Partida(){}
    
    public Partida(String data, String hora, Clube mandante, Clube visitante, Estadio estadio) {
        this.data = data;
        this.hora = hora;
        this.mandante = mandante;
        this.visitante = visitante;
        this.estadio = estadio;
    }

    public Arbitro[] getJuizes() {
        return juizes;
    }

    public void setJuizes(Arbitro juizes) {
        this.juizes[this.quantidadeArbitro] = juizes;
        this.quantidadeArbitro++;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Clube getMandante() {
        return mandante;
    }

    public void setMandante(Clube mandante) {
        this.mandante = mandante;
    }

    public Clube getVisitante() {
        return visitante;
    }

    public void setVisitante(Clube visitante) {
        this.visitante = visitante;
    }
        
}
