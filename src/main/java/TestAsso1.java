import fr.univ_amu.iut.beans.Module;
import fr.univ_amu.iut.beans.Prof;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestAsso1 {
    // La requete de test
    static final String req = "SELECT * " +
            "FROM PROF,MODULE "+
            "WHERE PROF.MAT_SPEC = MODULE.CODE";

    public static void main(String[] args) throws SQLException {
        System.out.println("Connexion");
        try (Connection con = ConnexionUnique.getInstance().getConnection()){
            System.out.println("Connecte\n");
            Statement stmt = con.createStatement();
            System.out.println("Execution de la requete : " + req );
            ResultSet rset = stmt.executeQuery(req);
            ArrayList<Prof> profs = new ArrayList<Prof>();
            while (rset.next()){
                Prof prof = new Prof();
                prof.setNumProf(rset.getInt("NUM_PROF"));
                prof.setNomProf(rset.getString("NOM_PROF"));
                prof.setPrenomProf(rset.getString("Prenom_PROF"));
                prof.setAdrProf(rset.getString("ADR_PROF"));
                prof.setCpProf(rset.getString("CP_PROF"));
                prof.setVilleProf(rset.getString("Ville_PROF"));
                profs.add(prof);

                Module module = new Module();
                module.setCode(rset.getString("CODE"));
                module.setCoefCc(rset.getInt("COEFF_CC"));
                module.setCoefTest(rset.getInt("COEFF_TEST"));
                module.setDiscipline(rset.getString("DISCIPLINE"));
                module.sethCoursPrev(rset.getInt("H_COURS_PREV"));
                module.sethCoursRea(rset.getInt("H_COURS_REA"));
                module.sethTpPrev(rset.getInt("H_TP_PREV"));
                module.sethTpRea(rset.getInt("H_TP_REA"));
                module.setLibelle(rset.getString("LIBELLE"));

                prof.setMatSpec(module);
            }
            for (Prof prof : profs) {
                System.out.println(prof.toString()+ "\n");
            }
            stmt.close();
            System.out.println("\nOk.\n");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "\n");
        }
    }
}

