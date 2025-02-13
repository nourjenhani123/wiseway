package org.example.services;

import org.example.entities.Foyer;
import org.example.entities.Restaurant;
import org.example.utils.MyDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceRestaurant implements IService<Restaurant> {


    private Connection connection;

    public ServiceRestaurant() {
        connection = MyDataBase.getInstance().getConnection();
    }

    @Override
    public void ajouter(Restaurant restaurant) throws SQLException {
        String sql = "INSERT INTO restaurant (nom_restau, heure_ouverture,heure_fermeture, nombre_repas, description_restau) VALUES ('"
                + restaurant.getNom_restau() + "', '"
                + restaurant.getHeure_ouverture() + "', '"
                + restaurant.getHeure_fermeture() + "', '"
                + restaurant.getNombre_repas() + "', '"
                + restaurant.getDescription_restau() + "')";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }



    @Override
    public void modifier(Restaurant restaurant) throws SQLException {
        String sql = "UPDATE `restaurant` SET `nom_restau`=?, `heure_ouverture`=?, `heure_fermeture`=?, `nombre_repas`=?, `description_restau`=? WHERE `id_restau`=?";

        PreparedStatement ps = connection.prepareStatement(sql);

        // Convertir java.util.Date en java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(restaurant.getHeure_ouverture().getTime());

        ps.setString(1, restaurant.getNom_restau());
        ps.setTime(2, restaurant.getHeure_ouverture());  // Utilisation de java.sql.Time
        ps.setTime(3, restaurant.getHeure_fermeture());  // Utilisation de java.sql.Time
        ps.setInt(4, restaurant.getNombre_repas());
        ps.setString(5, restaurant.getDescription_restau());
        ps.setInt(6, restaurant.getId_restau());

        ps.executeUpdate();
    }


    @Override
    public void supprimer(int id_restau)throws SQLException {
        String sql = "DELETE FROM `restaurant` WHERE `id_restau`=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id_restau);
        ps.executeUpdate();
    }


    @Override
    public List<Restaurant> afficher() throws SQLException {
        List<Restaurant> restaurants = new ArrayList<>();
        String sql = "SELECT * FROM `restaurant`";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            restaurants.add(new Restaurant(
                    resultSet.getInt("id_restau"),
                    resultSet.getString("nom_restau"),
                    resultSet.getTime("heure_ouverture"),
                    resultSet.getTime("heure_fermeture"),
                    resultSet.getInt("nombre_repas"),
                    resultSet.getString("description_restau")

            ));
        }
        return restaurants;
    }


}
