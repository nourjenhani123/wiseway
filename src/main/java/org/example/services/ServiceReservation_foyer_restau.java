package org.example.services;

import org.example.entities.Reservation_foyer_restau;
import org.example.utils.MyDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceReservation_foyer_restau implements IService<Reservation_foyer_restau> {



    @Override
    public void ajouter(Reservation_foyer_restau reservation_foyer_restau) throws SQLException {
        String query = "INSERT INTO reservation_foyer_restau (type_chambre, avec_restau, nombre_repas,  description, id_foyer, id_restau,id_etudiant)VALUES(?,?,?,?,?,?,?)";

        try (Connection connection = MyDataBase.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1,reservation_foyer_restau.getType_chambre());
            preparedStatement.setString(2,reservation_foyer_restau.getAvec_restau());
            preparedStatement.setString(3,reservation_foyer_restau.getNombre_repas());
            preparedStatement.setString(4,reservation_foyer_restau.getDescription());
            preparedStatement.setInt(5,reservation_foyer_restau.getId_foyer());
            preparedStatement.setInt(6,reservation_foyer_restau.getId_restau());
            preparedStatement.setInt(7,reservation_foyer_restau.getId_etudiant());


            preparedStatement.executeUpdate();
            System.out.println("Réservation ajoutée avec succès");

        }

    }

    @Override
    public void modifier(Reservation_foyer_restau reservation_foyer_restau) throws SQLException {
        String query = "UPDATE reservation_foyer_restau SET type_chambre=?, avec_restau=?, nombre_repas=?, description=?, id_foyer=?, id_restau=?, id_etudiant=? WHERE id_reservation_foyer_restau=?";


        try (Connection connection = MyDataBase.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, reservation_foyer_restau.getType_chambre());
            preparedStatement.setString(2, reservation_foyer_restau.getAvec_restau());
            preparedStatement.setString(3, reservation_foyer_restau.getNombre_repas());
            preparedStatement.setString(4, reservation_foyer_restau.getDescription());
            preparedStatement.setInt(5, reservation_foyer_restau.getId_foyer());
            preparedStatement.setInt(6, reservation_foyer_restau.getId_restau());
            preparedStatement.setInt(7, reservation_foyer_restau.getId_etudiant());
            preparedStatement.setInt(8, reservation_foyer_restau.getId_reservation_foyer_restau()); // Assurez-vous que cet ID existe dans votre classe

            preparedStatement.executeUpdate();
            System.out.println("Réservation modifiée avec succès");
        }
    }


    @Override
    public void supprimer(int id) throws SQLException {
        String query = "DELETE FROM reservation_foyer_restau WHERE id_reservation_foyer_restau = ?";

        try (Connection conn = MyDataBase.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Réservation supprimée avec succès !");
            } else {
                System.out.println("Aucune réservation trouvée avec cet ID.");
            }
        }

    }

    @Override
    public List<Reservation_foyer_restau> afficher() throws SQLException {
        List<Reservation_foyer_restau> reservations = new ArrayList<>();
        String query = "SELECT id_reservation_foyer_restau,type_chambre, avec_restau, nombre_repas,  description, id_foyer, id_restau,id_etudiant FROM reservation_foyer_restau";

        try (Connection conn = MyDataBase.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id_reservation_foyer_restau = rs.getInt("id_reservation_foyer_restau");
                String type_chambre = rs.getString("type_chambre");
                String avec_restau = rs.getString("avec_restau");
                String nombre_repas = rs.getString("nombre_repas");
                String description = rs.getString("description");
                int id_foyer = rs.getInt("id_foyer");
                int id_restau = rs.getInt("id_restau");
                int id_etudiant = rs.getInt("id_etudiant");

                // Créer un objet ReservationUniversite et ajouter à la liste
                Reservation_foyer_restau reservation = new Reservation_foyer_restau(id_reservation_foyer_restau,type_chambre, avec_restau, nombre_repas,  description, id_foyer, id_restau,id_etudiant);

                reservations.add(reservation);
            }
        }

        return reservations;
    }


}


