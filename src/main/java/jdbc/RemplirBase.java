package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RemplirBase {

	public static void main(String[] args) {
		try{
			Class.forName("org.hsqldb.jdbcDriver") ;	
			Connection connexion = DriverManager.getConnection( "jdbc:hsqldb:hsql://localhost/", "SA", null );
			String requete = "INSERT INTO Persons(PersonID, FirstName, Age) VALUES ('1', 'Tintin', '20')";
			PreparedStatement statement = connexion.prepareStatement(requete);
			int result = statement.executeUpdate();
			if(result != 1){
				System.out.println("Erreur");
				System.exit(result);
			}
			System.out.println("Table remplit");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
