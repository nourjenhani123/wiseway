package org.example.entities;

public class Universite {

    private int id;
    private String nomuniversite;
    private String description;
    private String pays;
    private String image;
    private float montant;

    public Universite() {
    }

    public Universite(int id, String nomuniversite,  String description, String pays, String image, float montant) {
        this.id = id;
        this.nomuniversite = nomuniversite;
        this.description = description;
        this.montant = montant;
        this.pays = pays;
        this.image = image;
    }

    public Universite( String nomuniversite, String description, String pays, String image, float montant) {
        this.nomuniversite = nomuniversite;
        this.description = description;
        this.montant = montant;
        this.pays = pays;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomuniversite() {
        return nomuniversite;
    }

    public void setNomuniversite(String nomuniversite) {
        this.nomuniversite = nomuniversite;
    }





    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public float getMontant() {
        return montant;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "id=" + id +
                ", nomuniversite='" + nomuniversite + '\'' +
                ", description='" + description + '\'' +
                ", pays='" + pays + '\'' +
                ", image='" + image + '\'' +
                ", montant=" + montant +
                '}';
    }
}
