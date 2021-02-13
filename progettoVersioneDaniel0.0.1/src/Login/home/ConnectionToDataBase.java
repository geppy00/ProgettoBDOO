
package Login.home;
import java.sql.*;
import javax.swing.table.DefaultTableModel; 
import javax.swing.JTable;

public class ConnectionToDataBase {
    
/*CONNESSIONE AL DATABASE SUL SERVER POSTGRESQL 13*/
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
        

	/*CODICE PER FAR COMPARIRE SULLA CONSOLE LA TABELLA DEL NOSTRO DATABASE (SELECT OPERATION)*/
	public int selectOperation(String nomeUtente, String passwordUtente) {
            Statement stmt = null;
            Connection connection = connectionToDatabase();

            try {
                stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM login_tbl;");
		while(rs.next()) {
                          
                    String nomeUtenteSalvato = rs.getString("username");
                    String passwordUtenteSalvato = rs.getString("pswd");
                    if (nomeUtenteSalvato.equals(nomeUtente)&& passwordUtenteSalvato.equals(passwordUtente)){
                        if(passwordUtenteSalvato.equals("admin") && nomeUtenteSalvato.equals("admin"))
                            return 0;
                        else
                            return 1;
                    }
        
		}
                rs.close();
                stmt.close();
            	connection.close();
            }
            catch(Exception e) {
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
            
            return -1;
	}

	/*CODICE PER AGGIORNARE I RECORD DELLA NOSTRA TABELLA DEL NOSTRO DATABASE (UPDATE OPERATION)*/
	public void updateOperation() {
		Statement stmt = null;
		Connection connection = connectionToDatabase();

		try {
			connection.setAutoCommit(false);
			stmt = connection.createStatement();
			String sql = "UPDATE PERSONA set ETA = 15 WHERE ID = 2;";
			stmt.executeUpdate(sql);
			connection.commit();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONA;");
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				int eta = rs.getInt("eta");
				System.out.println("ID = " + id);
				System.out.println("NOME = " + nome);
				System.out.println("COGNOME = " + cognome);
				System.out.println("età = " + eta);
				System.out.println("");
			}
			rs.close();
			stmt.close();
			connection.close();
		}catch(Exception e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Operazione di UPDATE effettuata con successo");
	}

	/*CODICE PER ELIMINARE I RECORD DELLA NOSTRA TABELLA DEL NOSTRO DATABASE (DELETE OPERATION)*/
	public void deleteOperation() {
		Statement stmt = null;
		Connection connection = connectionToDatabase();

		try {
			connection.setAutoCommit(false);
			stmt = connection.createStatement();
			String sql = "DELETE FROM PERSONA WHERE ID = 3";
			stmt.executeUpdate(sql);
			connection.commit();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONA;");
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				int eta = rs.getInt("eta");
				System.out.println("ID = " + id);
				System.out.println("NOME = " + nome);
				System.out.println("COGNOME = " + cognome);
				System.out.println("età = " + eta);
				System.out.println("");
			}
			rs.close();
			stmt.close();
			connection.close();
		}catch(Exception e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
	}
        
        public void prendiDatiProcuratori(){
            Statement stmt = null;
            Connection connct1 = connectionToDatabase();
            
            try{
                
                stmt = connct1.createStatement();
                ResultSet rs = stmt.executeQuery("select * from procuratori_tbl");
                
                while(rs.next()){
                    
                    String id = rs.getString("code_id");
                    String codiceFiscale = rs.getString("codice_fiscale");
                    String nome = rs.getString("nome");
                    String iban = rs.getString("iban");
                    
                    //Array di stringhe per inserire i dati nella jtable
                    String tbData[]= {id, codiceFiscale, nome, iban};
                    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                }
                rs.close();
                stmt.close();
                connct1.close();
                
            }catch(Exception e){
                
                System.out.println("Errore nella stampa ");
                System.exit(0);
                
            }
        }
}
