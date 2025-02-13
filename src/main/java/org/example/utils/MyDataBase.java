package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDataBase {
    private final String URL = "jdbc:mysql://localhost:3306/wiseway";
    private final String USER = "root";
    private final String PSW = "";
    private Connection connection;
    private static MyDataBase instance;

    public MyDataBase() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiseway", "root", "");
            System.out.println("Connected");
        } catch (Exception var2) {
            Exception e = var2;
            System.out.println(e.getMessage());
        }

    }

    public static MyDataBase getInstance() {
        if (instance == null) {
            instance = new MyDataBase();
        }

        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }
}
