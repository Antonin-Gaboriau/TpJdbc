import java.sql.*;

public class TestConnexion {

    static final String req = "SELECT NUM_ET, NOM_ET, PRENOM_ET, CP_ET, VILLE_ET, ANNEE, GROUPE " +
            "FROM ETUDIANT " +
            "WHERE VILLE_ET = 'AIX-EN-PROVENCE'";

    public static void main(String[] args) throws SQLException {
        System.out.println("Connexion");
        try (Connection con = ConnexionUnique.getInstance().getConnection()){
            System.out.println("Connecte\n");
            Statement stmt = con.createStatement();
            System.out.println("Execution de la requete : " + req );
            ResultSet rset = stmt.executeQuery(req);
            while (rset.next()){
                System.out.print(rset.getInt("NUM_ET") + " ");
                System.out.print(rset.getString("NOM_ET") + " ");
                System.out.println(rset.getString("PRENOM_ET"));
            }
            stmt.close();
            System.out.println("\nOk.\n");
        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
    }
}
