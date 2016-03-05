package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseAccess {

	public static void main(String[] args) 
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String selectSQL = "SELECT codigo, nome, sexo, email from Person";
		
		try (Connection con = DriverManager.getConnection(url, "valdeci", "8428");
				PreparedStatement stm = con.prepareStatement(selectSQL);
				ResultSet res= stm.executeQuery())
		{
			//stm.executeUpdate() --> Executes the SQL statement in this PreparedStatement object, which must be an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE; 
			if(res.next() ==false)
			{
				System.out.println("No rows selected");
			}
			while (res.next())
			{
				System.out.println(res.getString("nome"));
			}
			
		} 
		catch (SQLException e) 
		{
			System.out.println("parameters invalids!");
		}
	}

}
