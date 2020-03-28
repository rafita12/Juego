package Jugadores;

import java.util.Scanner;

import Personajes.Personajes;

public class Jugador1 {
    private boolean turno;
    private Personajes[]listaPersonajes;
    private int nPersonajes;


public Jugador1(){
    this.listaPersonajes=new Personajes[11];
    this.nPersonajes=0;
 }

    public void eliminaPersonaje(Personajes pj) {

        int inx, i;
        inx = buscaPersonajes(pj);

        if (inx == -1) {
            this.nPersonajes--;
        }
        nPersonajes--;
        for (i = inx; i < nPersonajes; i++) {
            listaPersonajes[i] = listaPersonajes[i + 1];
        }
        listaPersonajes[i] = null;
    }

    public int buscaPersonajes(Personajes pj) {

        int inx = -1;
        boolean enc = false;
        for (int i = 0; !enc && i < listaPersonajes.length; i++) {
            if (listaPersonajes[i].equals(pj)) {
                enc = true;
                inx = i;
            }
        }
        return inx;
    }

}