package fr.univ_amu.iut;

import fr.univ_amu.iut.DAO.JDBC.DAOEtudiantJDBC;
import fr.univ_amu.iut.beans.Etudiant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class  TestEntite {
    // La requete de test
    static final String req = "SELECT NUM_ET, NOM_ET, PRENOM_ET , CP_ET, VILLE_ET, ANNEE, GROUPE " +
            "FROM ETUDIANT " +
            "WHERE VILLE_ET = 'AIX-EN-PROVENCE'";

    public static void main(String[] args) throws SQLException {
        System.out.println("Connexion");
        try (Connection con = ConnexionUnique.getInstance().getConnection()){
            System.out.println("Connecte\n");
            Statement stmt = con.createStatement();
            System.out.println("Execution de la requete : " + req );
            ResultSet rset = stmt.executeQuery(req);
            ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
            while (rset.next()){
                Etudiant etudiant = new Etudiant();
                etudiant.setNumEt(rset.getInt("NUM_ET"));
                etudiant.setNomEt(rset.getString("NOM_ET"));
                etudiant.setPrenomEt(rset.getString("Prenom_ET"));
                etudiant.setCpEt(rset.getString("CP_ET"));
                etudiant.setVilleEt(rset.getString("Ville_ET"));
                etudiant.setAnnee(rset.getInt("Annee"));
                etudiant.setGroupe(rset.getInt("Groupe"));
                etudiants.add(etudiant);
            }
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant.toString()+ "\n");
            }
            stmt.close();
            System.out.println("\nOk.\n");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "\n");
        }
    }
}

