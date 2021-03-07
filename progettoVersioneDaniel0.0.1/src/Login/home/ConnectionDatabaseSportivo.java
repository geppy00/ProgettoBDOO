
package Login.home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ConnectionDatabaseSportivo {
    public Connection connectionToDatabase() {
        Connection connection = null;

	try {
			
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProjectOOBD", "postgres", "SNOWEBELLO12");
			
            if(connection != null) {
		System.out.println("Connessione al database effettuata con successo ");
            }
	}catch(Exception e) {
            System.out.println(e);
            System.out.println("Connection FAILED ");
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
	}
		
	return connection;
    }
    
    public void inserisciNuovoSportivoDB(String[] datiSportivo, Date sqlDate, String code_id){
        Statement stmt = null;
	Connection connection = connectionToDatabase();

	try {	
            connection.setAutoCommit(false);
            String sql = "INSERT INTO sportivi_tbl (codicefiscale, nome, cognome, sesso, datadinascita, ibansportivo, tipologiasport, mail, code_id)"+
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt.setString(1, datiSportivo[0]);
            preparedStmt.setString(2, datiSportivo[1]);
            preparedStmt.setString(3, datiSportivo[2]);
            preparedStmt.setString(4, datiSportivo[3]);
            preparedStmt.setDate(5, (java.sql.Date) sqlDate);
            preparedStmt.setString(6, datiSportivo[4]);
            preparedStmt.setString(7, datiSportivo[5]);
            preparedStmt.setString(8, datiSportivo[6]);
             preparedStmt.setString(8, code_id);
                  
            preparedStmt.execute();
			
            connection.commit();
            connection.close();
        }catch(Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
	}
        System.out.println("I record sono stati creati correttamente");
    }
    
    public void cercaSportivoDB(){
        
    }
    
}
