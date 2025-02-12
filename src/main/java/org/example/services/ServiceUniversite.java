package org.example.services;

import org.example.entities.Universite;
import org.example.utils.MyDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceUniversite implements IService<Universite>
{


    private Connection connection;
    public ServiceUniversite(){
        connection = MyDataBase.getInstance().getConnection();
    }


    @Override
    public void ajouter(Universite universite) throws SQLException {
        String sql = "INSERT INTO universite (nomuniversite, description, pays, image, montant) VALUES ('"
                + universite.getNomuniversite() + "', '"
                + universite.getDescription() + "', '"
                + universite.getPays() + "', '"
                + universite.getImage() + "', "
                + universite.getMontant() + ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }




    @Override
    public void modifier(Universite universite) throws SQLException {
            String sql = "UPDATE `universite` SET `nomuniversite`=?, `description`=?,  `pays`=?, `image`=?, `montant`=? WHERE `id`=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            // Assurez-vous que l'ID est bien passé en dernier (paramètre 7)
            ps.setString(1, universite.getNomuniversite());
            ps.setString(2, universite.getDescription());
            ps.setString(3, universite.getPays());
            ps.setString(4, universite.getImage());
            ps.setDouble(5, universite.getMontant());
            ps.setInt(6, universite.getId()); // Assurez-vous
        ps.executeUpdate();
    }

    @Override
    public void supprimer(int id) throws SQLException {
        String sql = "DELETE FROM `universite` WHERE id =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }


    @Override
    public List<Universite> afficher() throws SQLException {
        List<Universite> universites = new ArrayList<>();
        String sql = " SELECT * FROM `universite`";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            universites.add(new Universite(
                    rs.getInt("id"),
                    rs.getString("nomuniversite"),
                    rs.getString("description"),  // Si 'status' est BOOLEAN dans la base
                    rs.getString("pays"),
                    rs.getString("image"),
                    rs.getFloat("montant")
            ));

        }
        return universites;
    }
    }

