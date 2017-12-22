/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import java.util.ArrayList;
import java.util.Scanner;
import lp2.controllers.Datas;

/**
 *
 * @author Leonardo
 */
public class TesteTimes {
    
    
    
    public static void imprimeTimeEstadio(Estadio e) {
        for (int i = 0; i < e.getQuantideTimes(); i++) {
            System.out.println("Clube: " + e.getTimes()[i].getNome());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        Scanner in = new Scanner(System.in);
        Partida partida = new Partida();
        ArrayList<Jogador> jogadoresC1 = new ArrayList();
        ArrayList<Jogador> jogadoresC2 = new ArrayList();
        ArrayList<ComissaoTecnica> comissaoTecnicaC1 = new ArrayList();
        ArrayList<ComissaoTecnica> comissaoTecnicaC2 = new ArrayList();
        ArrayList<Clube> clubes = new ArrayList();
        ArrayList<Estadio> estadios = new ArrayList();
        ArrayList<Arbitro> arbitros = new ArrayList();
        
        while(true){            
            System.out.println("------------------- Laboratório 02 ------------------- \n");
            
            
            System.out.println("------------------- Clube 1 ------------------- \n");            
            criaClube(clubes);
            System.out.println("------------------- -------------- ------------------- \n");
            
            System.out.println("------------------- Criar Jogadores do " + clubes.get(0).getNome() + " ------------------- \n");            
            while(true){
                System.out.println("Nome Jogador: ");
                String nomeJogador = in.nextLine();
                System.out.println("CPF: ");
                String cpfJogador = in.nextLine();
                System.out.println("Salário: ");
                String salarioJogador = in.nextLine();
                System.out.println("Posição: ");
                String posicaoJogador = in.nextLine();
                System.out.println("Perna: ");
                String pernaJogador = in.nextLine();

                try{
                    Jogador model = new Jogador(nomeJogador, cpfJogador, Double.valueOf(salarioJogador), posicaoJogador, pernaJogador);
                    jogadoresC1.add(model);
                }catch(NumberFormatException e){
                    System.out.println("Falha no registro.\n");
                }

                try{
                    System.out.println("Inserir novo jogador? [0] - Parar");
                    String op = in.nextLine();
                    if(Integer.valueOf(op) == 0) break; 
                }catch(NumberFormatException e){
                    System.out.println("...\n");
                }
            }
            System.out.println("------------------- -------------- ------------------- \n");
            
            System.out.println("------------------- Comissão Técnica  do " + clubes.get(0).getNome() + " ------------------- \n");            
            while(true){
                System.out.println("Nome: ");
                String nomeCt = in.nextLine();
                System.out.println("CPF: ");
                String cpfCt = in.nextLine();
                System.out.println("Salário: ");
                String salarioCt = in.nextLine();
                System.out.println("Função: ");
                String funcaoCt = in.nextLine();

                try{
                    comissaoTecnicaC1.add(new ComissaoTecnica(nomeCt, cpfCt, Double.valueOf(salarioCt), funcaoCt));
                }catch(NumberFormatException e){
                    System.out.println("Falha no registro.\n");
                }

                try{
                    System.out.println("Inserir novo membro da Comissão Técnica? [0] - Parar");
                    String op = in.nextLine();
                    if(Integer.valueOf(op) == 0) break; 
                }catch(NumberFormatException e){
                    System.out.println("...\n");
                }
            }
            System.out.println("------------------- -------------- ------------------- \n");
            
            for (int i = 0; i < jogadoresC1.size(); i++) {
                clubes.get(0).setFuncionario(jogadoresC1.get(i)); 
            }
            for (int i = 0; i < comissaoTecnicaC1.size(); i++) {
                clubes.get(0).setFuncionario(comissaoTecnicaC1.get(i)); 
            }

        
            System.out.println("------------------- Clube 2 ------------------- \n");            
            criaClube(clubes);
            System.out.println("------------------- -------------- ------------------- \n");
            
            System.out.println("------------------- Criar Jogadores do " + clubes.get(1).getNome() + " ------------------- \n");            
            while(true){
                System.out.println("Nome Jogador: ");
                String nomeJogador = in.nextLine();
                System.out.println("CPF: ");
                String cpfJogador = in.nextLine();
                System.out.println("Salário: ");
                String salarioJogador = in.nextLine();
                System.out.println("Posição: ");
                String posicaoJogador = in.nextLine();
                System.out.println("Perna: ");
                String pernaJogador = in.nextLine();

                try{
                    Jogador model = new Jogador(nomeJogador, cpfJogador, Double.valueOf(salarioJogador), posicaoJogador, pernaJogador);
                    jogadoresC2.add(model);
                }catch(NumberFormatException e){
                    System.out.println("Falha no registro.\n");
                }

                try{
                    System.out.println("Inserir novo jogador? [0] - Parar");
                    String op = in.nextLine();
                    if(Integer.valueOf(op) == 0) break; 
                }catch(NumberFormatException e){
                    System.out.println("...\n");
                }
            }
            System.out.println("------------------- -------------- ------------------- \n");
            
            System.out.println("------------------- Comissão Técnica  do " + clubes.get(1).getNome() + " ------------------- \n");            
            while(true){
                System.out.println("Nome: ");
                String nomeCt = in.nextLine();
                System.out.println("CPF: ");
                String cpfCt = in.nextLine();
                System.out.println("Salário: ");
                String salarioCt = in.nextLine();
                System.out.println("Função: ");
                String funcaoCt = in.nextLine();

                try{
                    comissaoTecnicaC2.add(new ComissaoTecnica(nomeCt, cpfCt, Double.valueOf(salarioCt), funcaoCt));
                }catch(NumberFormatException e){
                    System.out.println("Falha no registro.\n");
                }

                try{
                    System.out.println("Inserir novo membro da Comissão Técnica? [0] - Parar");
                    String op = in.nextLine();
                    if(Integer.valueOf(op) == 0) break; 
                }catch(NumberFormatException e){
                    System.out.println("...\n");
                }
            }
            System.out.println("------------------- -------------- ------------------- \n");
            
            for (int i = 0; i < jogadoresC2.size(); i++) {
                clubes.get(1).setFuncionario(jogadoresC2.get(i)); 
            }
            for (int i = 0; i < comissaoTecnicaC2.size(); i++) {
                clubes.get(1).setFuncionario(comissaoTecnicaC2.get(i)); 
            }
            
            System.out.println("------------------- Estádio ------------------- \n");            
            System.out.println("Nome: ");
            String nomeEst = in.nextLine();
            System.out.println("Cidade: ");
            String cidadeEst = in.nextLine();
            System.out.println("Estado: ");
            String estadoEst = in.nextLine();

            estadios.add(new Estadio(nomeEst, cidadeEst, estadoEst));
        
            System.out.println("------------------- -------------- ------------------- \n");
            
            estadios.get(0).setTimes(clubes.get(0));
            estadios.get(0).setTimes(clubes.get(1));
            clubes.get(0).setEstadio(estadios.get(0));
            clubes.get(1).setEstadio(estadios.get(0));
        
            System.out.println("------------------- Arbitros ------------------- \n");            
            while(true){
                System.out.println("Nome: ");
                String nomeArb = in.nextLine();
                System.out.println("Função: ");
                String funcaoArb = in.nextLine();

                arbitros.add(new Arbitro(nomeArb, funcaoArb));

                try{
                    System.out.println("Inserir novo arbitro? [0] - Parar");
                    String op = in.nextLine();
                    if(Integer.valueOf(op) == 0) break; 
                }catch(NumberFormatException e){
                    System.out.println("...\n");
                }
            }
            System.out.println("------------------- -------------- ------------------- \n");
            
            
            partida = new Partida(Datas.dataAtual(), Datas.horaAtual(),clubes.get(0), clubes.get(0), estadios.get(0));
            for (int i = 0; i < arbitros.size(); i++) {
                partida.setJuizes(arbitros.get(i));
            }
            
            System.out.println("------------------- DADOS DA PARTIDA -------------------");
            System.out.println("\nJogadores Escalados do " + clubes.get(0).getNome() + ":");
            for (int i = 0; i < jogadoresC1.size(); i++) {
                System.out.println(jogadoresC1.get(i).getNome());
            }
            System.out.println("\nComissão Técnica:");
            for (int i = 0; i < comissaoTecnicaC1.size(); i++) {
                System.out.println(comissaoTecnicaC1.get(i).getNome());
            }

            System.out.println("------------ ------------ ------------");
            System.out.println("\nJogadores Escalados do " + clubes.get(1).getNome() + ":");
            for (int i = 0; i < jogadoresC2.size(); i++) {
                System.out.println(jogadoresC2.get(i).getNome());
            }
            System.out.println("\nComissão Técnica:");
            for (int i = 0; i < comissaoTecnicaC2.size(); i++) {
                System.out.println(comissaoTecnicaC2.get(i).getNome());
            }

            System.out.println("\n------------ ------------ ------------");
            System.out.println("\nArbitros:");
            for (int i = 0; i < arbitros.size(); i++) {
                System.out.println(arbitros.get(i).getNome());
            }

            System.out.println("\n------------ ------------ ------------");
            System.out.println("Local da Partida: " + estadios.get(0).getNome()); 
            System.out.println("Data/Hora: " + partida.getData() + " " + partida.getHora() ); 
            System.out.println("Mandante x Visitante: " + clubes.get(0).getNome() + " vs " + clubes.get(1).getNome());
                 
            try{
                System.out.println("Criar Nova Partida? [0] PARAR");
                String op = in.nextLine();
                if(Integer.valueOf(op) == 0){
                    System.out.println("Gerando nova partida ... \n");
                    break; 
                } 
            }catch(NumberFormatException e){
                System.out.println("...\n");
            }
        }
        
        System.out.println("\n------------------- Fim do Programa -------------------");     
        
    }
       
    
    public static void criaClube(ArrayList<Clube> clube){
        Scanner in = new Scanner(System.in);
        System.out.println("Nome: ");
        String nomeCb = in.nextLine();
        System.out.println("Cidade: ");
        String cidadeCb = in.nextLine();
        System.out.println("Estado: ");
        String estadoCb = in.nextLine();

        clube.add(new Clube(nomeCb, cidadeCb, estadoCb));
    }
        
    
}
