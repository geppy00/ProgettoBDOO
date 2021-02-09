
package Login.home;
import java.sql.*;

public class ConnectionToDataBase {
    
/*CONNESSIONE AL DATABASE SUL SERVER POSTGRESQL 13*/
	public Connection connectionToDatabase() {
		Connection connection = null;

		try {
			
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SDB_Procuratori", "postgres", "postgres");
			
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

	/*CODICE PER CREARE UNA TABELLA (CREATE TABLE)*/
	public void createTable() {
		Connection connection = connectionToDatabase();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String sql = "CREATE TABLE Procuratori"+
						 "(ID INT PRIMARY KEY NOT NULL,"+
						 "NOME TEXT NOT NULL,"+
						 "COGNOME TEXT NOT NULL,"+
						 "ETA INT NOT NULL)";
			stmt.executeUpdate(sql);
			stmt.close();
			connection.close();
		}catch(Exception e){
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("La tabella è stata creata con successo");
	}

	/*CODICE PER INSERIRE I DATI NELLA TABELLA (INSERT OPERATION)*/
	public void insertOperation() {
		Statement stmt = null;
		Connection connection = connectionToDatabase();

		try {	
			stmt = connection.createStatement();
			connection.setAutoCommit(false);
			String sql = "INSERT INTO PERSONA (ID, NOME, COGNOME, ETA)"+
						 "VALUES (1, 'Daniil', 'Khalikov', '21')";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO PERSONA (ID, NOME, COGNOME, ETA)"+
					 "VALUES (2, 'Jeft faria', 'Matamba', '24')";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO PERSONA (ID, NOME, COGNOME, ETA)"+
					 "VALUES (3, 'Giuseppe', 'Malafronte', '20')";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO PERSONA (ID, NOME, COGNOME, ETA)"+
					 "VALUES (4, 'Nicola', 'Palmieri', '45')";
			stmt.executeUpdate(sql);
			
			stmt.close();
			connection.commit();
			connection.close();
		}catch(Exception e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("I record sono stati creati correttamente");
	}

	/*CODICE PER FAR COMPARIRE SULLA CONSOLE LA TABELLA DEL NOSTRO DATABASE (SELECT OPERATION)*/
	public int selectOperation(String nomeUtente, String passwordUtente) {
		Statement stmt = null;
		Connection connection = connectionToDatabase();

		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM loginUtente;");
			while(rs.next()) {
                            
                            String passwordAdmin = "admin";
                            String utenteAdmin = "admin";
                          
				String nomeUtenteSalvato = rs.getString("utente");
                                String passwordUtenteSalvato = rs.getString("passwordUtente");
                                if (nomeUtenteSalvato.equals(nomeUtente)&& passwordUtenteSalvato.equals(passwordUtente)){
                                    return 1;
                                
                                    
                                }if(passwordUtenteSalvato.equals(passwordAdmin) && nomeUtenteSalvato.equals(utenteAdmin)){
                                    return 2;
                                }
                                
                                   
			}
			rs.close();
			stmt.close();
			connection.close();
 		}catch(Exception e) {
 			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		//System.out.println("La stampa della tabella è andata a buon fine");
                return 0; 
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
        
        public void stampaTabellaTerminale(){
            Statement stmt = null;
            Connection connct1 = connectionToDatabase();
            
            try{
                
                stmt = connct1.createStatement();
                ResultSet rs = stmt.executeQuery("select * from UTENTI");
                
                while(rs.next()){
                    
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String cognome = rs.getString("cognome");
                    int eta = rs.getInt("eta");
                    System.out.println("ID = "+id);
                    System.out.println("Nome = "+nome);
                    System.out.println("Cognome = "+cognome);
                    System.out.println("Eta = "+eta);
                    System.out.println("");
                    
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
