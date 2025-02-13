package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDataBase {
    private final String URL = "jdbc:mysql://localhost:3306/WiseWay";
    private final String USER = "root";
    private final String PSW = "";
    private Connection connection;
    private static MyDataBase instance;

    // Constructeur privé pour empêcher l'instanciation directe
    public MyDataBase() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PSW);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }

    // Méthode pour obtenir l'instance unique (Singleton)
    public static MyDataBase getInstance() {
        if (instance == null) {
            instance = new MyDataBase();
        }
        return instance;
    }

    // Méthode pour obtenir la connexion avec vérification
    public Connection getConnection() {
        try {
            if (this.connection == null || this.connection.isClosed()) {
                System.out.println("Réouverture de la connexion...");
                this.connection = DriverManager.getConnection(URL, USER, PSW);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion : " + e.getMessage());
        }
        return this.connection;
    }

    // Méthode pour fermer la connexion proprement
    public void closeConnection() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
                System.out.println("Connexion fermée.");
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
        }
    }
}
