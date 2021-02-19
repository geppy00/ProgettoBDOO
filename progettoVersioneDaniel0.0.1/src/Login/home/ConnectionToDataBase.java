
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
	public void deleteOperation(String idEliminare) {
		Statement stmt = null;
		Connection connection = connectionToDatabase();

		try {
                        String sql = "DELETE FROM procuratori_tbl WHERE code_id =?";
                        PreparedStatement preparedStmt = connection.prepareStatement(sql);
                        preparedStmt.setString(1, idEliminare);
                        preparedStmt.executeUpdate();
			connection.close();
		}catch(Exception e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
	}
        
        public void InserisciNuovoProcuratore(int capCopiato, String cittaResidenzaCopiato, String codiceFiscCopiato, String cognomeCopiato, Date sqlDate, String ibanCopiato, String nomeCopiato, String viaCopiato, String codiceIDCopiato, String cittaNascitaCopiato){
            Statement stmt = null;
		Connection connection = connectionToDatabase();

		try {	
			connection.setAutoCommit(false);
			String sql = "INSERT INTO procuratori_tbl (code_id, codice_fiscale, nome, cognome, data_di_nascita, citta_nascita, via, citta, cap, iban)"+
						 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                         PreparedStatement preparedStmt = connection.prepareStatement(sql);
                         preparedStmt.setString(1, codiceIDCopiato);
                         preparedStmt.setString(2, codiceFiscCopiato);
                         preparedStmt.setString(3, nomeCopiato);
                         preparedStmt.setString(4, cognomeCopiato);
                         preparedStmt.setDate(5, sqlDate);
                         preparedStmt.setString(6, cittaNascitaCopiato);
                         preparedStmt.setString(7, viaCopiato);
                         preparedStmt.setString(8, cittaResidenzaCopiato);
                         preparedStmt.setInt(9, capCopiato);
                         preparedStmt.setString(10, ibanCopiato);
                  
			preparedStmt.execute();
			
			connection.commit();
			connection.close();
		}catch(Exception e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("I record sono stati creati correttamente");
        }
        
       public void updateProcuratori(String idCopiato){
        AggiornaDatiProcuratore updateProc = new AggiornaDatiProcuratore();
        Connection connection = connectionToDatabase();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String cognome= null;
        
        try{
            stmt = connection.prepareStatement("SELECT * FROM procuratori_tbl WHERE code_id LIKE ?");
            stmt.setString(1, idCopiato+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
               /*String id = rs.getString("code_id");
               String codiceFiscale = rs.getString("codice_fiscale");
               String nome = rs.getString("nome");*/
               cognome = rs.getString("cognome");
               /*Date d = rs.getDate("data_di_nascita");
               String cittaNascita = rs.getString("citta_nascita");
               String via =  rs.getString("via");
               String cittaResidenza =  rs.getString("citta");
               int cap = rs.getInt("cap");
               String iban =  rs.getString("iban");*/
               
               updateProc.stampaCognome(cognome);
            }
            
            
        }catch(Exception e){
                System.out.println("Errore nella stampa ");
                System.exit(0);
            }
       }
}
