package email_benachrichtigung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.openDBConnection();
	}
	
	public static void openDBConnection(){
		//Abfrage definieren
        String query = "SELECT * FROM Charge WHERE Ch_Eintragsdatum = '25.10.2009';";
        //Datenbankverbindung herstellen
        try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection( "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:/medilogic.mdb","","" );
			System.out.println("Connection Successful ");
	        Statement stmt = con.createStatement();
	        ResultSet rst = stmt.executeQuery(query);
	        ResultSetMetaData md = rst.getMetaData();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}

}
