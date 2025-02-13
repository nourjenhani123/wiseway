package org.example.services;

import org.example.entities.Foyer;
import org.example.utils.MyDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceFoyer implements IService<Foyer> {

    private Connection connection;

    public ServiceFoyer() {
        connection = MyDataBase.getInstance().getConnection();
    }

    @Override
    public void ajouter(Foyer foyer)throws SQLException {
        String sql = "INSERT INTO foyer (nom_foyer, adresse_foyer,nb_chambre_femme, nb_chambre_homme, image_chambre, prix_foyer, chambre_indiv, chambre_a_deux, chambre_a_trois)VALUES('"
                + foyer.getNom_foyer() + "','"
                + foyer.getAdresse_foyer() + "','"
                + foyer.getNb_chambre_femme() + "','"
                + foyer.getNb_chambre_homme() + "','"
                + foyer.getImage_chambre() + "','"
                + foyer.getPrix_foyer() + "','"
                + foyer.getChambre_indiv() + "','"
                + foyer.getChambre_a_deux() + "','"
                + foyer.getChambre_a_trois() + "')";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

    }


    @Override

    public void modifier(Foyer foyer)throws SQLException {
        String sql = "UPDATE `foyer` SET `nom_foyer`=?,`adresse_foyer`=? , `nb_chambre_femme`=? ,`nb_chambre_homme`=?, `image_chambre`=?, `prix_foyer`=?, `chambre_indiv`=?, `chambre_a_deux`=?, `chambre_a_trois`=? WHERE `id_foyer`=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, foyer.getNom_foyer());
        ps.setString(2, foyer.getAdresse_foyer());
        ps.setString(3, foyer.getNb_chambre_femme());
        ps.setString(4, foyer.getNb_chambre_homme());
        ps.setString(5, foyer.getImage_chambre());
        ps.setInt(6, foyer.getPrix_foyer());
        ps.setString(7, foyer.getChambre_indiv());
        ps.setString(8, foyer.getChambre_a_deux());
        ps.setString(9, foyer.getChambre_a_trois());
        ps.setInt(10, foyer.getId_foyer());
        ps.executeUpdate();
    }

    @Override
    public void supprimer(int id_foyer)throws SQLException {
        String sql = "DELETE FROM `foyer` WHERE `id_foyer`=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id_foyer);
        ps.executeUpdate();
    }


    @Override
    public List<Foyer> afficher() throws SQLException {
        List<Foyer> foyers = new ArrayList<>();
        String sql = "SELECT * FROM `foyer`";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            foyers.add(new Foyer(
                    resultSet.getInt("id_foyer"),
                    resultSet.getString("nom_foyer"),
                    resultSet.getString("adresse_foyer"),
                    resultSet.getString("nb_chambre_femme"),
                    resultSet.getString("nb_chambre_homme"),
                    resultSet.getString("image_chambre"),
                    resultSet.getInt("prix_foyer"),
                    resultSet.getString("chambre_indiv"),
                    resultSet.getString("chambre_a_deux"),
                    resultSet.getString("chambre_a_trois")

            ));
        }
        return foyers;
    }


}
