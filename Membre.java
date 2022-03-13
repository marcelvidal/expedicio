package expedicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Membre {


    private String nom;
    private int edat;
    private int escalada;
    private int esqui;
    private int alpinisme;
    private int idMembre;
    private boolean subvencionat;


    public Membre(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }


    public Membre(String nom, int edat, int escalada, int esqui, int alpinisme) {
        this.nom = nom;
        this.edat = edat;
        this.escalada = escalada;
        this.esqui = esqui;
        this.alpinisme = alpinisme;
        this.idMembre = tornarID();


    }


    public double mitjana() {

        double resultat = 0;
        return resultat;

    }

    @Override
    public String toString() {
        return "Name is: " + this.nom + " & Age is: " + this.edat + " & Escalada is: " +this.escalada+ " & Esqui is: " +this.esqui + " Alpinisme is: " +this.alpinisme+ " Id Membre is: " +this.idMembre;
    }

    public int tornarID() {

        Calendar calendario = Calendar.getInstance();

        Date date = new Date();

        calendario.setTime(date);

        int dateYear = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);


        String StringId = "" + dateYear + hora + minutos + segundos + "";
        int iTest = Integer.valueOf(StringId);

        return iTest;

        //20/01/13/2009    any/mes/dia/hora
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getEscalada() {
        return escalada;
    }

    public void setEscalada(int escalada) {
        this.escalada = escalada;
    }

    public int getEsqui() {
        return esqui;
    }

    public void setEsqui(int esqui) {
        this.esqui = esqui;
    }

    public int getAlpinisme() {
        return alpinisme;
    }

    public void setAlpinisme(int alpinisme) {
        this.alpinisme = alpinisme;
    }
}


