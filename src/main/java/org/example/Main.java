package org.example;

import org.example.entities.Reservation_foyer_restau;
import org.example.services.ServiceReservation_foyer_restau;
import org.example.utils.MyDataBase;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {


        MyDataBase myDataBase = new MyDataBase();
       // ServiceFoyer sf = new ServiceFoyer();
        //ServiceRestaurant sr = new ServiceRestaurant();
        ServiceReservation_foyer_restau sfr = new ServiceReservation_foyer_restau();

        try {
            //sf.ajouter(new Foyer("foyer1","rue2","12 femme","14 homme","image.png",8000,"chamb1","chamb2","chamb3"));
           // sf.modifier(new Foyer(1,"foyer1","rue1","12 femme","14 homme","image.png",8000,"chamb1","chamb2","chamb3"));
            //sf.ajouter(new Foyer("foyer2","rue2","15 femme","14 homme","image.png",8000,"chamb1","chamb2","chamb3"));
             //sf.supprimer(2);
           // System.out.println(sf.afficher());

             //sr.ajouter(new Restaurant("restau3", "02:00", "14:00", 7, "abcde"));

            // Convertir les chaînes d'heure en objets Time
           /*
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

            Date ouvertureDate = sdf.parse("10:00");
            Time heureOuverture = new Time(ouvertureDate.getTime());

            Date fermetureDate = sdf.parse("17:00");
            Time heureFermeture = new Time(fermetureDate.getTime());

            sr.modifier(new Restaurant(1, "restau2", heureOuverture, heureFermeture, 3, "azerty"));

            */

           // sr.supprimer(2);
           // System.out.println(sr.afficher());



           // sfr.ajouter(new Reservation_foyer_restau("indiv","oui","3","lala",1,1,1));
            //sfr.modifier(new Reservation_foyer_restau(1,"a deux","non","2","lala",1,1,1));
             //sfr.ajouter(new Reservation_foyer_restau("a trois","oui","3","abcd",1,1,1));
           // sfr.supprimer(2);
            System.out.println(sfr.afficher());

        } catch (SQLException e) {
            // Gérer l'exception SQL ici
            e.printStackTrace();
        } catch (Exception e) {
            // Gérer les autres exceptions ici
            e.printStackTrace();
        }
    }

}
