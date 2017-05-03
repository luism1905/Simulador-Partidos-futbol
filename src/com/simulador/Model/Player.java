

package com.simulador.Model;

import java.lang.Math;

public class Player 
{
   
    private int numAleatoryPass;
    
    private int numAleatoryGoal;
    
    public int getNumAleatoryGoal()
    {
        return numAleatoryGoal;
    }

    public void generateNumAleatoryGoal(int numAleatoryGoal)
    {
        this.numAleatoryGoal = (int) (Math.random() * 100 + 1);
    } 
  
    public  boolean PassBall(double porcPass)
    {
        int numAleatoryPass = (int) (Math.random() * 100 + 1);
        
        if((numAleatoryPass + porcPass * 100) > 100){
         
            return true;   
            
        }    
        else return false;
    }
    public boolean Goal(double annotA, double fitB)
    {
        int numAleatoryGoal = (int) (Math.random() * 100 + 1);
        
        if((numAleatoryGoal + (annotA * 100) + (fitB *100)) > 150){
         
            return true;   
            
        }    
        else return false;
    }

    

}
