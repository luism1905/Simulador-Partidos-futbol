
package com.simulador.Model;

import com.simulador.controller.ControllerMain;
import java.util.Random;
/**
 * El Partido arranca El Controlador
 * 
 */

public class Partido extends Thread
{
        private ControllerMain c;

    public Partido(ControllerMain c) {
        this.c = c;
    }
        
    public ControllerMain getC() {
        return c;
    }

    public void setC(ControllerMain c) {
        this.c = c;
    }

    public Partido() {
      
    }
    /**
     * Inicia el Partido
     * manda a correr el hilo Partido
     */
    public void run(){
        try{
            while(true){
                c.Iniciar();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
   
}
