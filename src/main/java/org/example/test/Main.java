package org.example.test;

import org.example.entities.ReservationUniversite;
import org.example.entities.Universite;
import org.example.services.ServiceReservationUniversite;
import org.example.services.ServiceUniversite;
import org.example.utils.MyDataBase;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {


        MyDataBase myDataBase = new MyDataBase();
       ServiceUniversite sp = new ServiceUniversite();
        ServiceReservationUniversite sr = new ServiceReservationUniversite();

        try {


           // sr.afficher();

          //  System.out.println(sr.afficher());

           // sp.ajouter(new Universite( "endtab", "jolie", "borjcedria", "image5.jpg", 7500));
           //System.out.println("université ajouté");
           // sp.modifier(new Universite( 51,"esprit", "jolie", "russie", "image5.jpg", 7500));
            //sp.modifier(new Universite(13,"ispri",false, "Un campus spacieux", "tunis","image10.jpg", 8000));
            //sp.modifier(new Universite(16,"UAS", false, "jolie", "russie", "image5.jpg", 7500));
             //sp.modifier(new Universite(12,"CIFAC", false, "belle universite","france","image1.png",150));
            //sp.ajouter(new Universite(false, "Harvard", "grande universite","amérique","image15.png",150000));
            //sp.modifier(new Universite(17,"Harvard", false, "grande universite","australie","image15.png",150000));

//sp.modifier(new Universite( 20,"tekup", "cv", "russie", "image5.jpg", 7500));
            //sp.modifier(new Universite( 33,"enstab", "bon lieu sud", "ben arous", "image5.jpg", 7500));
           // sp.supprimer(49);

         //  sp.ajouter(new Universite("joulen", "grande universite","amérique","image15.png",150000));
          //  sr.ajouter(new ReservationUniversite(1, 18, "En cours"));
          //  sr.ajouter(new ReservationUniversite(2, 13, "accepté"));
           //sr.ajouter(new ReservationUniversite(3, 17, "annulé"));
          //  sr.ajouter(new ReservationUniversite(4, 16, "accepte"));
           //sr.ajouter(new ReservationUniversite(9, 27, "annulé"));

        // System.out.println("Réservation ajoutée avec succés");
            //sr.ajouter(new ReservationUniversite(5, 17, "En cours"));

           // sp.ajouter(new Universite( "isln", "jolie", "nabeul", "image10.jpg", 1200));
           // sp.ajouter(new Universite( "isbat", "belle", "tunis", "image8.jpg", 7550));
          //  sp.modifier(new Universite( 47,"nouressem7a", "belle", "tunis", "image8.jpg", 1000000));

            //sr.modifier(new ReservationUniversite(7,9, 27, "en cours"));

            //System.out.println("réservation modifiée");
         //sp.supprimer(24);
           // System.out.println("université suprimée avec succée");
          sr.supprimer(10);
         System.out.println("réservation suprimée avec succée");


          //  sr.supprimer(9);
//sp.afficher();
//System.out.println(sp.afficher());

          //  sp.ajouter(new Universite( "esprit", "Un campus moderne", "tunis", "image4.jpg", 8400));
          //  System.out.println("université ajouté");
       // System.out.println("université modifiée");

         //  System.out.println(sp.afficher());

sr.afficher();
System.out.println(sr.afficher());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    }
