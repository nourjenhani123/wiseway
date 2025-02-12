package org.example.services;

import org.example.entities.ReservationUniversite;
import org.example.entities.Universite;
import org.example.utils.MyDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceReservationUniversite implements IService<ReservationUniversite> {

    @Override

    public void ajouter(ReservationUniversite reservationUniversite) throws SQLException {
        String query = "INSERT INTO reservationuniversite (id_etudiant, id_universite, etat_reservation) VALUES (?, ?, ?)";

        try (Connection conn = MyDataBase.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, reservationUniversite.getId_etudiant());
            pstmt.setInt(2, reservationUniversite.getId_universite());
            pstmt.setString(3, reservationUniversite.getEtat_reservation());

            pstmt.executeUpdate();
            System.out.println("Réservation ajoutée avec succès !");
        }
    }



    @Override
    public void modifier(ReservationUniversite reservationUniversite) throws SQLException {
    }
    @Override
    public void supprimer(int id) throws SQLException {
        String query = "DELETE FROM reservationuniversite WHERE id = ?";

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
    public List<ReservationUniversite> afficher() throws SQLException {
        List<ReservationUniversite> reservations = new ArrayList<>();
        String query = "SELECT id, id_etudiant, id_universite, date_reservation, etat_reservation FROM reservationuniversite";

        try (Connection conn = MyDataBase.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                int id_etudiant = rs.getInt("id_etudiant");
                int id_universite = rs.getInt("id_universite");
                Date date_reservation = rs.getDate("date_reservation");
                String etat_reservation = rs.getString("etat_reservation");

                // Créer un objet ReservationUniversite et ajouter à la liste
                ReservationUniversite reservation = new ReservationUniversite(id, id_etudiant, id_universite, etat_reservation);
                reservation.setDateReservation(date_reservation);  // Assigner la date récupérée à l'objet

                reservations.add(reservation);
            }
        }

        return reservations;
    }

    }

