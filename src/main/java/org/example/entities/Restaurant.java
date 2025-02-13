package org.example.entities;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Restaurant {
    private int id_restau;
    private String nom_restau;
    private Time heure_ouverture;
    private Time heure_fermeture;
    private int nombre_repas;
    private String description_restau;

    public Restaurant() {
    }

    public Restaurant(int id_restau, String nom_restau, Time heure_ouverture, Time heure_fermeture, int nombre_repas, String description_restau) {
        this.id_restau = id_restau;
        this.nom_restau = nom_restau;
        this.heure_ouverture = heure_ouverture;
        this.heure_fermeture = heure_fermeture;
        this.nombre_repas = nombre_repas;
        this.description_restau = description_restau;
    }

    // Constructeur qui accepte des chaînes pour les heures
    public Restaurant(String nom_restau, String heure_ouverture_str, String heure_fermeture_str, int nombre_repas, String description_restau) throws Exception {
        this.nom_restau = nom_restau;

        // Convertir les chaînes d'heure en java.sql.Time
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        // Convertir les chaînes en java.util.Date, puis en java.sql.Time
        Date ouverture = sdf.parse(heure_ouverture_str);
        this.heure_ouverture = new Time(ouverture.getTime());

        Date fermeture = sdf.parse(heure_fermeture_str);
        this.heure_fermeture = new Time(fermeture.getTime());

        this.nombre_repas = nombre_repas;
        this.description_restau = description_restau;
    }

    // Getters et Setters
    public int getId_restau() {
        return id_restau;
    }

    public void setId_restau(int id_restau) {
        this.id_restau = id_restau;
    }

    public String getNom_restau() {
        return nom_restau;
    }

    public void setNom_restau(String nom_restau) {
        this.nom_restau = nom_restau;
    }

    public Time getHeure_ouverture() {
        return heure_ouverture;
    }

    public void setHeure_ouverture(Time heure_ouverture) {
        this.heure_ouverture = heure_ouverture;
    }

    public Time getHeure_fermeture() {
        return heure_fermeture;
    }

    public void setHeure_fermeture(Time heure_fermeture) {
        this.heure_fermeture = heure_fermeture;
    }

    public int getNombre_repas() {
        return nombre_repas;
    }

    public void setNombre_repas(int nombre_repas) {
        this.nombre_repas = nombre_repas;
    }

    public String getDescription_restau() {
        return description_restau;
    }

    public void setDescription_restau(String description_restau) {
        this.description_restau = description_restau;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id_restau=" + id_restau +
                ", nom_restau='" + nom_restau + '\'' +
                ", heure_ouverture=" + heure_ouverture +
                ", heure_fermeture=" + heure_fermeture +
                ", nombre_repas=" + nombre_repas +
                ", description_restau='" + description_restau + '\'' +
                '}';
    }
}
