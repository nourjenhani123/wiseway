package org.example.entities;

public class Reservation_foyer_restau {

    private int id_reservation_foyer_restau;
    private String type_chambre;
    private String avec_restau;
    private String nombre_repas;
    private String description;
    private int id_foyer;
    private int id_restau;
    private int id_etudiant;

    public Reservation_foyer_restau() {

    }

    public Reservation_foyer_restau(int id_reservation_foyer_restau, String type_chambre, String avec_restau, String nombre_repas, String description, int id_foyer, int id_restau, int id_etudiant) {
        this.id_reservation_foyer_restau = id_reservation_foyer_restau;
        this.type_chambre = type_chambre;
        this.avec_restau = avec_restau;
        this.nombre_repas = nombre_repas;
        this.description = description;
        this.id_foyer = id_foyer;
        this.id_restau = id_restau;
        this.id_etudiant = id_etudiant;


    }

    public Reservation_foyer_restau(String type_chambre, String avec_restau, String nombre_repas, String description , int id_foyer, int id_restau, int id_etudiant) {
        this.type_chambre = type_chambre;
        this.avec_restau = avec_restau;
        this.nombre_repas = nombre_repas;
        this.description = description;
        this.id_foyer = id_foyer;
        this.id_restau = id_restau;
        this.id_etudiant = id_etudiant;

    }

    public Reservation_foyer_restau(String type_chambre, String avec_restau, String nombre_repas, String description) {
        this.type_chambre = type_chambre;
        this.avec_restau = avec_restau;
        this.nombre_repas = nombre_repas;
        this.description = description;
    }

    public int getId_reservation_foyer_restau() {
        return id_reservation_foyer_restau;
    }

    public void setId_reservation_foyer_restau(int id_reservation_foyer_restau) {
        this.id_reservation_foyer_restau = id_reservation_foyer_restau;
    }

    public String getType_chambre() {
        return type_chambre;
    }

    public void setType_chambre(String type_chambre) {
        this.type_chambre = type_chambre;
    }

    public String getAvec_restau() {
        return avec_restau;
    }

    public void setAvec_restau(String avec_restau) {
        this.avec_restau = avec_restau;
    }

    public String getNombre_repas() {
        return nombre_repas;
    }

    public void setNombre_repas(String nombre_repas) {
        this.nombre_repas = nombre_repas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public int getId_foyer() {
        return id_foyer;
    }

    public void setId_foyer(int id_foyer) {
        this.id_foyer = id_foyer;
    }

    public int getId_restau() {
        return id_restau;
    }

    public void setId_restau(int id_restau) {
        this.id_restau = id_restau;
    }

    @Override
    public String toString() {
        return "ReservationFoyerRestau{" +
                "id_reservation_foyer_restau=" + id_reservation_foyer_restau +
                ", type_chambre='" + type_chambre + '\'' +
                ", avec_restau='" + avec_restau + '\'' +
                ", nombre_repas='" + nombre_repas + '\'' +
                ", description='" + description + '\'' +
                ", id_foyer=" + id_foyer +
                ", id_restau=" + id_restau +
                ", id_etudiant=" + id_etudiant +

                '}';
    }
}
