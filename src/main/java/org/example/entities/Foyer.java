package org.example.entities;

public class Foyer {
    private int id_foyer;
    private String nom_foyer;
    private String adresse_foyer;
    private String nb_chambre_femme;
    private String nb_chambre_homme;
    private String image_chambre;
    private int prix_foyer;
    private String chambre_indiv;
    private String chambre_a_deux;
    private String chambre_a_trois;

    public Foyer() {
    }


    public Foyer(int id_foyer,String nom_foyer, String adresse_foyer,String nb_chambre_femme,String nb_chambre_homme,String image_chambre, int prix_foyer,String chambre_indiv, String chambre_a_deux, String chambre_a_trois) {
        this.id_foyer = id_foyer;
        this.nom_foyer = nom_foyer;
        this.adresse_foyer = adresse_foyer;
        this.nb_chambre_femme = nb_chambre_femme;
        this.nb_chambre_homme = nb_chambre_homme;
        this.image_chambre = image_chambre;
        this.prix_foyer = prix_foyer;
        this.chambre_indiv = chambre_indiv;
        this.chambre_a_deux = chambre_a_deux;
        this.chambre_a_trois = chambre_a_trois;

    }

    public Foyer(String nom_foyer, String adresse_foyer,String nb_chambre_femme,String nb_chambre_homme,String image_chambre, int prix_foyer,String chambre_indiv, String chambre_a_deux, String chambre_a_trois) {
        this.nom_foyer = nom_foyer;
        this.adresse_foyer = adresse_foyer;
        this.nb_chambre_femme = nb_chambre_femme;
        this.nb_chambre_homme = nb_chambre_homme;
        this.image_chambre = image_chambre;
        this.prix_foyer = prix_foyer;
        this.chambre_indiv = chambre_indiv;
        this.chambre_a_deux = chambre_a_deux;
        this.chambre_a_trois = chambre_a_trois;

    }

    public int getId_foyer() {
        return id_foyer;
    }

    public void setId_foyer(int id_foyer) {
        this.id_foyer = id_foyer;
    }

    public String getNom_foyer() {
        return nom_foyer;
    }

    public void setNom_foyer(String nom_foyer) {
        this.nom_foyer = nom_foyer;
    }

    public String getAdresse_foyer() {
        return adresse_foyer;
    }

    public void setAdresse_foyer(String adresse_foyer) {
        this.adresse_foyer = adresse_foyer;
    }

    public String getNb_chambre_femme() {
        return nb_chambre_femme;
    }

    public void setNb_chambre_femme(String nb_chambre_femme) {
        this.nb_chambre_femme = nb_chambre_femme;
    }

    public String getNb_chambre_homme() {
        return nb_chambre_homme;
    }

    public void setNb_chambre_homme(String nb_chambre_homme) {
        this.nb_chambre_homme = nb_chambre_homme;
    }

    public String getImage_chambre() {
        return image_chambre;
    }

    public void setImage_chambre(String image_chambre) {
        this.image_chambre = image_chambre;
    }

    public int getPrix_foyer() {
        return prix_foyer;
    }

    public void setPrix_foyer(int prix_foyer) {
        this.prix_foyer = prix_foyer;
    }

    public String getChambre_indiv() {
        return chambre_indiv;
    }

    public void setChambre_indiv(String chambre_indiv) {
        this.chambre_indiv = chambre_indiv;
    }

    public String getChambre_a_deux() {
        return chambre_a_deux;
    }

    public void setChambre_a_deux(String chambre_a_deux) {
        this.chambre_a_deux = chambre_a_deux;
    }

    public String getChambre_a_trois() {
        return chambre_a_trois;
    }

    public void setChambre_a_trois(String chambre_a_trois) {
        this.chambre_a_trois = chambre_a_trois;
    }

    @Override
    public String toString() {
        return "Foyer{" +
                "id_foyer=" + id_foyer +
                ", nom_foyer='" + nom_foyer + '\'' +
                ", adresse_foyer='" + adresse_foyer + '\'' +
                ", nb_chambre_femme='" + nb_chambre_femme + '\'' +
                ", nb_chambre_homme='" + nb_chambre_homme + '\'' +
                ", image_chambre='" + image_chambre + '\'' +
                ", prix_foyer=" + prix_foyer +
                ", chambre_indiv='" + chambre_indiv + '\'' +
                ", chambre_a_deux='" + chambre_a_deux + '\'' +
                ", chambre_a_trois='" + chambre_a_trois + '\'' +
                '}';
    }
}