
package com.simulador.Model;

import com.simulador.controller.ControllerMain;
import java.util.ArrayList;
/**
 * Clase Team posee como atributos privados los datos del
 * Equipo: ident,ranking,poseion,win,pass,fit
 * Estas son las probabilidades dadas en la tabla respecto a los rankings
 *
*/

public class Team extends Thread{
    
    private double ident;
    
    private ControllerMain c;
    
    private double ranking;
    
    private double win;
    
    private double pass;
    
    private double fit;
    
    private double annotate;
    
    private String nameTeam;
    
    private boolean posseion;

    /*
        Setter y Getter de cada atributo dela clase
    */
    public ControllerMain getC() {
        return c;
    }

    public void setC(ControllerMain c) {
        this.c = c;
    }
    
    public Team() {
        
    }

    public double getIdent() {
        return ident;
    }

    public void setIdent(double id) {
        this.ident = id;
    }
    
    public Team(boolean p)
    {
        this.posseion=p;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public double getWin() {
        return win;
    }

    public void setWin(double win) {
        this.win = win;
    }

    public double getPass() {
        return pass;
    }

    public void setPass(double pass) {
        this.pass = pass;
    }

    public double getFit() {
        return fit;
    }

    public void setFit(double fit) {
        this.fit = fit;
    }

    public double getAnnotate() {
        return annotate;
    }

    public void setAnnotate(double annotate) {
        this.annotate = annotate;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String name) {
        this.nameTeam = name;
    }
/**
 * Constructor con Parametros
 * @param name
 * @param ranking 
 */
    public Team(String name, double ranking) {
        this.ranking = ranking;
        this.nameTeam=name;
    }
    
  /**
   * DetProb
   * Permite determinar la Probabilidad de cada euipo dependiendo el ranking
   */
    
    public void DetProb()
    {
        if(ranking>=1 && ranking<=10)
        {
          win=0.75;
          pass=0.6;
          fit=0.2;
          annotate=0.6;
          
        }
        else
        if(ranking>=11 && ranking<=20)
        {
           win=0.6;
           annotate=0.5;
           fit=0.3;
           pass=0.5;
        
        }
        else
         if(ranking>=21 && ranking<=30) 
         {
            win=0.5;
            annotate=0.4;
            fit=0.4;
            pass=0.4;        
         }
        else
         if(ranking>=31 && ranking<=40)
         {
            win=0.4;
            annotate=0.3;
            fit=0.45;
            pass=0.35;
         }
        else
         {
            win=0.3;
            annotate=0.25;
            fit=0.5;
            pass=0.3;
         }
    }
    /**
     * Carga de manera predeterminada la informacion de cada uno de los 
     * equipos y la guarda en una Lista.
     * @return 
     */
    public ArrayList<Team> getListado()
    {
        ArrayList<Team> ListadoEquipo=new ArrayList<Team>();
        Team objTeam=new Team("FC Bayern München",14);
        ListadoEquipo.add(objTeam);
        
        objTeam=null;
        objTeam=new Team("Chelsea FC",9);
        ListadoEquipo.add(objTeam);
        
        objTeam=null;
        objTeam=new Team("Juventus",4);
        ListadoEquipo.add(objTeam);
        
        objTeam=null;
        objTeam=new Team("Real Madrid CF",5);
        ListadoEquipo.add(objTeam);        
        
        objTeam=null;
        objTeam=new Team("FC Barcelona",3);
        ListadoEquipo.add(objTeam); 
        
        objTeam=null;
        objTeam=new Team("Club Atlético de Madrid",25);
        ListadoEquipo.add(objTeam);        

        objTeam=null;
        objTeam=new Team(" Arsenal FC",24);
        ListadoEquipo.add(objTeam); 
        
        objTeam=null;
        objTeam=new Team("Manchester United FC",13);
        ListadoEquipo.add(objTeam);  
    
        objTeam=null;
        objTeam=new Team("FC Astana",32);
        ListadoEquipo.add(objTeam);
        
        objTeam=null;
        objTeam=new Team("Galatasaray AŞ",33);
        ListadoEquipo.add(objTeam);        
        
        return ListadoEquipo;

    } 
    @Override
    public String toString()
    {
        return nameTeam;
    }

    public boolean isPosseion() {
        return posseion;
    }

    public void setPosseion(boolean posseion) {
        this.posseion = posseion;
    }
    /**
     * metodo run permite correr la Clase Team de Manera Concurrente
     */
    public void run(){
        try{
            while(true){
                c.Partido(this);
                 Thread.sleep((1000));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
