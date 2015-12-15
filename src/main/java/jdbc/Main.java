package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) {
		try{
			Class.forName("org.hsqldb.jdbcDriver") ;	// chargement du pilote
			Connection connexion = DriverManager.getConnection( "jdbc:hsqldb:hsql://localhost/", "SA", null );
			String requete = "CREATE TABLE Persons(PersonID int, FirstName varchar(255), Age integer)";
			PreparedStatement statement = connexion.prepareStatement(requete);
			int result = statement.executeUpdate();
			if(result != 0){
				System.out.println("Erreur");
				System.exit(result);
			}
			System.out.println("Table cree");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
