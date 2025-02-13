package org.example.entities;

import java.util.Date;

public class ReservationUniversite {
    private int id;
    private Date dateReservation;
    private String etat_reservation;
    private int id_etudiant;
    private int id_universite;

    public ReservationUniversite() {
    }


    public ReservationUniversite(int id, int id_etudiant, int id_universite, String etat_reservation) {
        this.id = id;
        this.dateReservation = new Date();
        this.etat_reservation = etat_reservation;
        this.id_etudiant = id_etudiant;
        this.id_universite = id_universite;
    }

    public ReservationUniversite( int id_etudiant, int id_universite, String etat_reservation) {
        this.id = id;
        this.dateReservation = new Date();
        this.etat_reservation = etat_reservation;
        this.id_etudiant = id_etudiant;
        this.id_universite = id_universite;
    }


    public ReservationUniversite( String etat_reservation) {
        this.dateReservation = new Date();
        this.etat_reservation = etat_reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getEtat_reservation() {
        return etat_reservation;
    }

    public void setEtat_reservation(String etat_reservation) {
        this.etat_reservation = etat_reservation;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public int getId_universite() {
        return id_universite;
    }

    public void setId_universite(int id_universite) {
        this.id_universite = id_universite;
    }






    @Override
    public String toString() {
        return "ReservationUniversite{" +
                "id=" + id +
                ", dateReservation=" + dateReservation +
                ", etat_reservation='" + etat_reservation + '\'' +
                ", id_etudiant=" + id_etudiant +
                ", id_universite=" + id_universite +
                '}';
    }
}
