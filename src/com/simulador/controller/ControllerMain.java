package com.simulador.controller;

import com.simulador.Model.Partido;
import com.simulador.Model.Player;
import com.simulador.Model.Team;
import com.simulador.View.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

public final class ControllerMain implements ActionListener {

    private Main objMain;

    private double TIME; // Tiempo del Partido

    private int cnGol1 = 0;
    private int cnGol2 = 0;
    private int cnPase1 = 0;
    private int cnPase2 = 0;
    private int cnChutes1 = 0;
    private int cnChutes2 = 0;

    private Semaphore balon = new Semaphore(1, true);
    //creo e instancio un semaforo 

    public ControllerMain() {
        objMain = new Main(null, false);//Crep un objeto de la 
        //Pantalla Principal del partido
        objMain.setVisible(true);// hago visible dicha interfaz
        CargarCombos();
        //Cargo los combos con la informacion de los equipos
        objMain.AggListener(this);

    }

    public void CargarCombos() {
        Team objTeam = new Team();
        /*
         recorro la lista de equipos y la cargo cada combo
         */
        for (int i = 0; i < objTeam.getListado().size(); i++) {
            objTeam = objTeam.getListado().get(i);
            objMain.getCmbEquipo1().addItem(objTeam);
            objMain.getCmbEquipo2().addItem(objTeam);
        }
    }
//Metodo que inicia el partido

    public void Iniciar() {

        while (TIME <= 90) {
            if (TIME == 45) {

                try {
                    objMain.getLblTime().setText("Fin del 1er Tiempo");
                    objMain.getLblTime().setText("Inicio del 2do Tiempo ");
                    Thread.sleep((5000));

                } catch (Exception e) {
                    System.out.print(e);
                }
            }
            objMain.getLblTime().setText(String.valueOf(TIME));
            TIME++;
            try {
                Thread.sleep((1000));

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public void Inicializar() {
        Team Equipo1 = new Team(); //Inicializo el Equipo 1
        Team Equipo2 = new Team();// Inicializo el Equipo 2
        Partido partido = new Partido(this);//Inicializo 1 partido
        partido.start();//Ejecuto el hilo partido
        Equipo1 = (Team) objMain.getCmbEquipo1().getSelectedItem();//Obtengo el Equipo 1 seleccionado por el usuario
        Equipo2 = (Team) objMain.getCmbEquipo2().getSelectedItem();// Obtengo el Equipo 2 seleccionado por el usuario
        Equipo1.setPosseion(true);//Inicialmente el Equipo1 tine la posesion del balon
        Equipo1.setIdent(1);
        Equipo2.setIdent(2);
        Equipo2.setPosseion(false);//Inicialmente el Equipo 2 NO posee el balon
        Equipo1.setC(this);
        Equipo2.setC(this);
        Equipo2.DetProb();
        Equipo1.DetProb();//Determina las probabilidades de cada equipo dependiendo
        // de la tabla dada en el enunciado por el profesor
        objMain.getLblBalon1().setVisible(false);
        objMain.getLblBalon2().setVisible(false);
        objMain.getLblrkg1().setText(String.valueOf(Equipo1.getRanking()));
        objMain.getLblRkg2().setText(String.valueOf(Equipo2.getRanking()));
        Equipo1.start();
        Equipo2.start();
        //Manda a ejecutar los dos hilos Equipo
    }

    public synchronized void Partido(Team Equipo) {
        Jugar(Equipo);
        Equipo.setPosseion(true);
    }

    public void Jugar(Team Equipo) {
        objMain.getCmbAlineacion().setVisible(false);
        objMain.getCmbAlineacion2().setVisible(false);
        objMain.getLblAlineacion().setVisible(false);
        objMain.getLblAlineacion2().setVisible(false);
        Equipo.setPosseion(true);
        Player objPlayer = new Player();
        try {
            balon.acquire(); // se le asigna al equipo el recurso compartido
            int contador = 0; //permite contar los pases que lleva el equipo para determinar
            //si hara´otro pase o chutará
            if (Equipo.getIdent() == 1) {
                objMain.getLblBalon1().setVisible(true);
                objMain.getLblBalon2().setVisible(false);
            } else {
                objMain.getLblBalon1().setVisible(false);
                objMain.getLblBalon2().setVisible(true);
            }
            objMain.getLblNarracionEq1().setText("EL Equipo " + Equipo.getNameTeam() + " Obtiene el balón");
            while (Equipo.isPosseion() == true && TIME <= 90) {

                Thread.sleep((1000));//alentiza la impresion por pantalla
                if (contador < 4) {
                    if (objPlayer.PassBall(Equipo.getPass())) {//Si el pase es exitoso(true)
                        contador++;// Aumenta +1 los pases hechos por el equipo
                        objMain.getLblNarracionEq1().setText("El Equipo " + Equipo.getNameTeam() + " realiza " + contador + " Pase(s) Exitoso");

                        if (Equipo.getIdent() == 1) {
                            cnPase1++;
                            objMain.getLblContPases1().setText(String.valueOf(cnPase1));
                        } else {
                            cnPase2++;
                            objMain.getLblContPases2().setText(String.valueOf(cnPase2));
                        }
                    } else {
                        objMain.getLblNarracionEq1().setText("El Equipo " + Equipo.getNameTeam() + " Pierde el balón");
                        Equipo.setPosseion(false);//Si no hay pase exitoso pierde la posesion del balon
                        Thread.sleep((1000));
                        balon.release();// libera el recurso compartido
                    }
                } else {
                    if (Equipo.getIdent() == 1) {
                        cnChutes1++;
                        objMain.getLblCnChutes1().setText(String.valueOf(cnChutes1));
                    } else {
                        cnChutes2++;
                        objMain.getLblCnChutes2().setText(String.valueOf(cnChutes2));
                    }
                    if (objPlayer.Goal(Equipo.getAnnotate(), Equipo.getFit())) {//logra hacer el gol
                        objMain.getLblNarracionEq1().setText("Gol del Equipo " + Equipo.getNameTeam());//Imprime este mensaje                    
                        if (Equipo.getIdent() == 1) {
                            cnGol1++;
                            objMain.getLblContGoles1().setText(String.valueOf(cnGol1));
                        } else {
                            cnGol2++;
                            objMain.getLblContGoles2().setText(String.valueOf(cnGol2));
                        }
                        Equipo.setPosseion(false);
                        Thread.sleep((1000));
                        balon.release();

                    } else {
                        objMain.getLblNarracionEq1().setText("El Equipo " + Equipo.getNameTeam() + " Falló el Gol");
                        Equipo.setPosseion(false);
                        Thread.sleep((1000));
                        balon.release();
                    }

                }
                if (TIME == 45) {

                    Thread.sleep((2000));//dar un tiempo mas prolongado cuando 
                    //finalice el 1er tiempo.
                    
                }
            }
               
                    if (cnGol1 > cnGol2 && Equipo.getIdent() == 1) {
                         objMain.getLblNarracionEq1().setText("Ha Finalizado el Partido... "+ Equipo.getNameTeam()+ " Ha ganado el partido");
                    } else if (cnGol2 > cnGol1 && Equipo.getIdent() == 2) {
                        objMain.getLblNarracionEq1().setText("Ha Finalizado el Partido... "+ Equipo.getNameTeam()+ " Ha ganado el partido");
                    } else {
                         objMain.getLblNarracionEq1().setText("Ha Finalizado el Partido... Ha Quedado Empatado el Partido");
                    }
              } catch (Exception e) {
            System.err.println("Ha Ocurrido un error");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Manejo del click del boton Jugar
        if (e.getActionCommand().equalsIgnoreCase("Jugar")) {
            Inicializar();
        }

    }

}
