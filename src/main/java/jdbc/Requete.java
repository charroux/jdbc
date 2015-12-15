package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Requete {

	public static void main(String[] args) {
		try{
			Class.forName("org.hsqldb.jdbcDriver") ;
			Connection connexion = DriverManager.getConnection( "jdbc:hsqldb:hsql://localhost/", "SA", null );
			String requete = "SELECT * FROM Persons";
			PreparedStatement statement = connexion.prepareStatement(requete);
			ResultSet result = statement.executeQuery();
			
			int id;
			String firstName;
			int age;
			
			while(result.next()){
				id = result.getInt("PersonID");
				firstName = result.getString("FirstName");
				age = result.getInt("Age");
				System.out.println(id + " " + firstName + " " + age);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
