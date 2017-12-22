/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Leonardo
 */
public class Datas {
        
    public static String dataAtual(){
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("d.m.Y");
        return formatar.format(data);
    }
    
    public static String horaAtual(){
        Date hora = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("H:m");
        return formatar.format(hora);        
    }
    
}
