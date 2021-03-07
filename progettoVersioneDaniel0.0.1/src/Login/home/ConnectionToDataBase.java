
package Login.home;
import static java.lang.Character.FORMAT;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel; 
import javax.swing.JTable;

public class ConnectionToDataBase {
    private static final String FORMAT = "yyyy/MM/dd";
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
	public String selectOperation(String nomeUtente, String passwordUtente, String sceltaTipoUtente) {
            Statement stmt = null;
            Connection connection = connectionToDatabase();
            String sceltaLogin=null;

            try {
                stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM login_tbl;");
		while(rs.next()) {
                          
                    String nomeUtenteSalvato = rs.getString("username");
                    String passwordUtenteSalvato = rs.getString("pswd");
                    sceltaLogin = rs.getString("scelta_login");
                    System.out.println(sceltaLogin+nomeUtenteSalvato+passwordUtenteSalvato);
                    
                    if(nomeUtenteSalvato.equals(nomeUtente) && passwordUtenteSalvato.equals(passwordUtente) && sceltaLogin.equals(sceltaTipoUtente)){
                         return sceltaLogin;
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
            
           return "Dati non corrispodenti";
	}
        

	/*CODICE PER AGGIORNARE I RECORD DELLA NOSTRA TABELLA DEL NOSTRO DATABASE (UPDATE OPERATION)*/
	public void updateProcuratore(String[] datiProc, String idCopiatoPerModificareDatiProc, Date dateNascitaSql){
            Connection connection = connectionToDatabase();
            //CONVERSIONE DEL CAP DA STRING AD INT
            int capInt=Integer.parseInt(datiProc[8]); 
          
            Statement stmt = null;
            
            try{
                connection.setAutoCommit(false);
                stmt = connection.createStatement();
                String sql= "UPDATE procuratori_tbl set code_id='"+datiProc[0]+"', codice_fiscale='"+datiProc[1]+
                            "',  nome='"+datiProc[2]+"', cognome='"+datiProc[3]+"', data_di_nascita='"+dateNascitaSql+
                            "', citta_nascita='"+datiProc[5]+"', via='"+datiProc[6]+"', citta='"+datiProc[7]+
                            "', cap='"+capInt+"', iban='"+datiProc[9]+"' WHERE code_id='"+idCopiatoPerModificareDatiProc+"';";
                stmt.executeUpdate(sql);
		connection.commit();
                stmt.close();
                connection.close();
            }catch(Exception e){
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
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
        
        
        public void InserisciNuovoProcuratore(int capCopiato, String cittaResidenzaCopiato, String codiceFiscCopiato, String cognomeCopiato, Date sqlDate, String ibanCopiato, String nomeCopiato, String viaCopiato, String codiceIDCopiato, String cittaNascitaCopiato, int idCopiatoDaLogin){
            Statement stmt = null;
		Connection connection = connectionToDatabase();

		try {	
			connection.setAutoCommit(false);
			String sql = "INSERT INTO procuratori_tbl (code_id, codice_fiscale, nome, cognome, data_di_nascita, citta_nascita, via, citta, cap, iban, idlogin)"+
						 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                        preparedStmt.setInt(11, idCopiatoDaLogin);
                        
                        preparedStmt.execute();
			
			connection.commit();
			connection.close();
		}catch(Exception e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("I record sono stati creati correttamente");
        }
        
       
     public String convertiDate(java.util.Date dataDiNascita){
        DateFormat df = new SimpleDateFormat(FORMAT);
        String strDate = df.format(dataDiNascita);
        return strDate;
    }
    
        
        
       public String[] updateProcuratori(String idCopiato){
        AggiornaDatiProcuratore updateProc = new AggiornaDatiProcuratore();
        Connection connection = connectionToDatabase();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        try{
            stmt = connection.prepareStatement("SELECT * FROM procuratori_tbl WHERE code_id LIKE ?");
            stmt.setString(1, idCopiato+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
               String id = rs.getString("code_id");
               String codiceFiscale = rs.getString("codice_fiscale");
               String nome = rs.getString("nome");
               String cognome = rs.getString("cognome");
               Date d = rs.getDate("data_di_nascita");
               String cittaNascita = rs.getString("citta_nascita");
               String via =  rs.getString("via");
               String cittaResidenza =  rs.getString("citta");
               int cap = rs.getInt("cap");
               String iban =  rs.getString("iban");
               
               //Effettuo le conversioni per creare un unico array di String
               String capConvertitoStr = Integer.toString(cap);
               String dataDiNascitaConvertitoStr = convertiDate(d);
               
               //Faccio un array per contenere tutti i dati
               String datiProcuratore[] = {id, codiceFiscale, nome, cognome, dataDiNascitaConvertitoStr, cittaNascita, via, cittaResidenza, capConvertitoStr, iban};
                return datiProcuratore;
            }
            
            
        }catch(SQLException e){
                System.out.println("Errore nella stampa ");
                System.exit(0);
            }
        
         return null;
       }
       
       
        public int prendiIdProcuratoreDaLogin(String usenameProcuratore){
            int n=0;
            Connection connection = connectionToDatabase();
            PreparedStatement stmt = null;
            ResultSet rs = null;
           
            try{
                connection.setAutoCommit(false);
                String sql = "SELECT * FROM login_tbl WHERE username LIKE ?;";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, usenameProcuratore+"%");
                rs = stmt.executeQuery();
                while(rs.next()){
                    n = rs.getInt("id");
                }
                return n;
            }catch(SQLException e) {
		System.err.println(e.getClass().getName()+": "+e.getMessage());
		System.exit(0);
            }
            return n;
       }
       
       public void nuovaPswdAndUsername(String newPassword,  String newUsername){
           Connection connection = connectionToDatabase();
           try{
               connection.setAutoCommit(false);
               String sql = "INSERT INTO login_tbl (username, pswd, scelta_login)"
                            +"VALUES (?, ?, ?)";
               
               PreparedStatement preparedStmt = connection.prepareStatement(sql);
               preparedStmt.setString(1, newUsername);
               preparedStmt.setString(2, newPassword);
               preparedStmt.setString(3, "procuratore");
               preparedStmt.execute();
               
               
               
               preparedStmt.close();
               connection.commit();
               connection.close();
           }catch(SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
       }
     
       public String[] prendiCredenzialiProcuratore(String idProcuratore){
           String[] datiProcuratore = new String[2];
           Connection connection = connectionToDatabase();
           PreparedStatement stmt = null;
           ResultSet rs = null;
           
           try{
                stmt = connection.prepareStatement("SELECT * FROM login_tbl WHERE id LIKE ?");
                stmt.setString(1, idProcuratore+"%");
                rs = stmt.executeQuery();
                while(rs.next()){
                    String username = rs.getString("username");
                    String pswd = rs.getString("pswd");
                    System.out.println("DATI PRESI"+username+pswd);
                    datiProcuratore[0]=username;
                    datiProcuratore[1]=pswd;
                    return datiProcuratore;
                }
           }catch(Exception e){
                System.out.println("Errore nella RICERCA ");
                System.exit(0);
            }
           
           return datiProcuratore;
       }
       
       public int prendiIdLoginPerEliminare(String idProcuratoreEliminare){
           int idDaLogin = -1;
           Connection connection = connectionToDatabase();
           try{
                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM procuratori_tbl WHERE code_id LIKE ?");
                stmt.setString(1, idProcuratoreEliminare+"%");
                ResultSet rs =  stmt.executeQuery();
                while(rs.next()){
                    idDaLogin = rs.getInt("idlogin");
                    return idDaLogin;
                }
                
           }catch(Exception e){
                System.out.println("!! Errore nella RICERCA id LOGIN non trovato !!");
                System.exit(0);
            }
           
           return idDaLogin;
       }
       
       public void modificaPasswordProcuratore(String idProcuratore, String nuovaPassword){
           
           int idLoginProc = prendiIdLoginPerEliminare(idProcuratore);
           Connection connection = connectionToDatabase();
            try{
                PreparedStatement stmt = connection.prepareStatement("UPDATE login_tbl SET pswd = '"+nuovaPassword+"' WHERE id = ?");
                stmt.setInt(1, idLoginProc);
                stmt.executeUpdate();
                connection.close();
           }catch(Exception e){
                System.out.println("!! Errore nell'AGGIORNAMENTO DELLA PASSSWORD id LOGIN non trovato !!");
                System.exit(0);
            }
       }  
       
       public void eliminaProcuratoreDaLogin(int idLogin){
            Statement stmt = null;
            Connection connection = connectionToDatabase();

            try {
                String sql = "DELETE FROM login_tbl WHERE id =?";
                PreparedStatement preparedStmt = connection.prepareStatement(sql);
                preparedStmt.setInt(1, idLogin);
                preparedStmt.executeUpdate();
                connection.close();
            }catch(Exception e) {
		System.err.println(e.getClass().getName()+": "+e.getMessage());
		System.exit(0);
            }
       }
}
