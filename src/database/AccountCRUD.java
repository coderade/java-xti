package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountCRUD 
{
	public void Transfer(Connection con, Account origin, Account destination, double value) throws SQLException
	{
		if(origin.balance >= value )
		{
			try
			{
				con.setAutoCommit(false);//Sets this connection's auto-commit mode to the given state. If a connection is in auto-commit mode, then all its SQL statements will be executed and committed as individual transactions.
				//Whitdraw
				origin.balance -= value;
				Update(con, origin);
			
				//Deposite 
				destination.balance +=value;
				Update(con, destination);
			
				con.commit();//Makes all changes made since the previous commit/rollback permanent and releases any database locks currently held by this Connection object
			}
			
			catch(Exception e)
			{
				con.rollback();
			}	
		}
	}
	
	public void Create(Connection con, Account account) 
	{
		
		String parameter = "Insert into Account values(?,?,?)";
		try(PreparedStatement stm = con.prepareStatement(parameter))
		{
			stm.setInt(1, account.number);
			stm.setString(2, account.name);
			stm.setDouble(3, account.balance);
			stm.executeUpdate();
		}
		catch (SQLException e) 
		{
			System.out.println("The parameters for insert in the table Account are invalids!");
		}
	}

	public void Update(Connection con, Account account) 
	{
		String parameter = "Update Account set name=?, balance=? where num =?";
		try(PreparedStatement stm = con.prepareStatement(parameter))
		{
			stm.setString(1, account.name);
			stm.setDouble(2, account.balance);	
			stm.setInt(3, account.number);
			stm.executeUpdate();
		}
		catch (SQLException e) 
		{
			System.out.println("The parameters for insert in the table Account are invalids!");
		}
	}
	
	public void Delete(Connection con, Account account) 
	{
		String parameter = "Delete Account where num =?";
		try(PreparedStatement stm = con.prepareStatement(parameter))
		{	
			stm.setInt(1, account.number);
			stm.executeUpdate();
		}
		catch (SQLException e) 
		{
			System.out.println("The parameters for insert in the table Account are invalids!");
		}
	}
	
	public List<Account> Read (Connection con) throws SQLException
	{
		List<Account> list = new ArrayList<>();
		String sql = "Select num, name, balance from Account";
		try(PreparedStatement stm = con.prepareStatement(sql); 
			ResultSet res = stm.executeQuery())
		{
			while (res.next()) 
			{
					list.add(new Account(res.getInt(1), res.getString(2), res.getDouble(3)));	
			}
				
		}		
		return list;
	}
	
	public static void main(String[] args) throws SQLException 
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try(Connection con = DriverManager.getConnection(url, "valdeci", "8428"))
		{
			
		AccountCRUD crud= new AccountCRUD();
			
			/*CREATE
			Account account1 = new Account(18, "Larry Ellison ", 3000000);
			crud.Create(con, account1);
			
			UPDATE
			Account account2 = new Account(16, "Bill Gates", 1000000);
			account1.balance = 5000000.00;
			crud.Update(con, account2);
			*/
			
			/*DELETE
			Account account3 = new Account(17, "Steve Jobs", 2000000);
			crud.Delete(con, account3);	
			
			READ*/
			
			List<Account> accounts = crud.Read(con);
			for (Account account : accounts) 
			{
				System.out.println(account);
			}
			
			Account origin = accounts.get(0);
			Account destination = accounts.get(1);
			
			/*TRANSFER*/
			crud.Transfer(con, origin, destination, 10000);
			
			accounts = crud.Read(con);
			for (Account account : accounts) 
			{
				System.out.println(account);
			}
			
		}
		
	}

}
