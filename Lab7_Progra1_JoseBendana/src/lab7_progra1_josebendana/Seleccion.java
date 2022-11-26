package lab7_progra1_josebendana;

import java.util.Random;

public class Seleccion {
    public String grupo;
    public String sele;
    public String dt;
    public int numjugadores;
    public String ganomundial;
    public String posicion;
    public int goles;
    
    public Seleccion(String grupo, String sele, String dt, int numjugadores, String ganomundial, String posicion, int goles){
        this.grupo=grupo;
        this.sele=sele;
        this.dt=dt;
        this.numjugadores=numjugadores;
        this.ganomundial=ganomundial;
        this.posicion=posicion;
        this.goles=goles;
    }
    

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSele() {
        return sele;
    }

    public void setSele(String sele) {
        this.sele = sele;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public int getNumjugadores() {
        return numjugadores;
    }

    public void setNumjugadores(int numjugadores) {
        this.numjugadores = numjugadores;
    }

    public String getGanomundial() {
        return ganomundial;
    }

    public void setGanomundial(String ganomundial) {
        this.ganomundial = ganomundial;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    

    @Override
    public String toString() {
        return   sele+" pertenece al "+grupo+"\nSu director tecnico es "+dt+"\nTiene " + numjugadores + " jugadores convocados \n" + ganomundial + " ha ganado un mundial\nEsta en la " + posicion + " posicion del grupo\n---Se ha creado exitosamente la seleccion de "+sele+"---";
    }
    
    public static int setgoles(){
        int equipo=new Random().nextInt((4 - 0) + 1) + 0;
        return (equipo);
    }
    
}
