
package Login.home;
import java.sql.*;
import java.util.HashSet;


public class Controller {
    
    loginForm f1;
    AdminPage f2;
    SezioneProcuratori f3;
    InserireNuovoProcuratore f4;
    EliminaProcuratore f5;
    AggiornaDatiProcuratore f6;
    CercaProcuratore f7;
    ModificaCredenziali f8;
    SezioneSportivo f9;
    AccessoProcuratore fp1;
    ControllerSportivo theControllerSportivo;
    GestioneSportivoDaProcuratore fp2;
    
            
    public static void main(String[] args) {
        
        Controller theController = new Controller();
        ControllerSportivo cSport = new ControllerSportivo();
        loginForm f1 = new loginForm(theController); 
        f1.setVisible(true);
        
    }
    
    public boolean accedi (String nomeUtente, String passwordUtente, loginForm f1, String sceltaTipoUtente, Controller theController ){
        System.out.println("nomeUtente: "+nomeUtente+" passwordUtente: "+passwordUtente);
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        String flag = db1.selectOperation(nomeUtente, passwordUtente, sceltaTipoUtente);
        System.out.println(flag);
        
        if(flag.equals("procuratore")){
            System.out.println("Login effettuato con successo");
            theControllerSportivo = new ControllerSportivo();
            theControllerSportivo.apriAccessoComeProcuratore();
            /*fp1 = new AccessoProcuratore(this);
            fp1.setVisible(true);*/
            f1.setVisible(false);
            return true;
        } 
        else if(flag.equals("admin")){  
            System.out.println("Benvenuto admin");
            ControllerSportivo cSport = new ControllerSportivo();
            f2 = new AdminPage(this, cSport);
            f2.setVisible(true);
            f1.setVisible(false);
            return true;
        }
        else if(flag.equals("sportivo")){
            System.out.println("BENVENUTO SPORTIVO");
            return true;
        }
        else if(flag.equals("Dati non corrispodenti")){
            System.out.println("Login non effettuato con successo Dati SBAGLIATI");
            return false;
        }
        else{
            System.out.println("Login non effettuato con successo");
            return false;
        }
    }
    
    public void apriSezioneProcuratori(){
        f3 = new SezioneProcuratori(this);
        f3.setVisible(true);
        f2.setVisible(false);
    }
    
     public void tornaIndietro(){
        f2.setVisible(true);
        f3.setVisible(false);
     }
     
     public void apriInserireNuovoProcuratore(){
        f4 = new InserireNuovoProcuratore(this);
        f4.setVisible(true);
     }
     
     public void okButtonInserimento(int capCopiato, String cittaResidenzaCopiato, String codiceFiscCopiato, String cognomeCopiato, Date sqlDate, String ibanCopiato, String nomeCopiato, String viaCopiato, String codiceIDCopiato, String cittaNascitaCopiato, int idCopiatoDaLogin){
          ConnectionToDataBase db1 = new ConnectionToDataBase();
          db1.InserisciNuovoProcuratore(capCopiato, cittaResidenzaCopiato, codiceFiscCopiato, cognomeCopiato, sqlDate, ibanCopiato, nomeCopiato, viaCopiato, codiceIDCopiato, cittaNascitaCopiato, idCopiatoDaLogin);
     }
     
     public void apriFinestraEliminaProcuratore(){
         f5 = new EliminaProcuratore(this);
         f5.setVisible(true);
     }
     
     public void cancellaProcuratore(String idEliminare){
         ConnectionToDataBase db1 = new ConnectionToDataBase();
         db1.deleteOperation(idEliminare);
     }
     
     public void apriFinestraAggiornaDatiProcuratore(){
         f6 = new AggiornaDatiProcuratore(this);
         f6.setVisible(true);
     }
     
     public String[] prendiDatiProcuratorePerAggiornare(String idCopiato){
          String[] datiProc = new String[10];
          ConnectionToDataBase db1 = new ConnectionToDataBase();
          datiProc = db1.updateProcuratori(idCopiato);
          return datiProc;
     }
     
     public void tornaIndietroInserireNuovoProcuratore(){
        f4.setVisible(false);
        f3.setVisible(true);
     }
     
     public void tornaIndietroLogin(){
        f2.setVisible(false);
        f1 = new loginForm(this);
        f1.setVisible(true);
     }
     
     public void tornaIndietroSezioneProcuratori(){
        f5.setVisible(false);
        f3.setVisible(true);
     }
     
     public void apriFinestraCercaProcuratore(){
        f7 = new CercaProcuratore(this);
        f7.setVisible(true);
     }
     
     public void tornaIndietroDaCercaProcuratore(){
          f7.setVisible(false);
          f3.setVisible(true);
     }
     
     public void aggiornaDatiProcuratore(String[] datiProc, String idCopiatoPerModificareDatiProc, Date dateNascitaSql){
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        db1.updateProcuratore(datiProc, idCopiatoPerModificareDatiProc, dateNascitaSql);
     }
     
     public void tornaIndietroDaAggiornaProcuratore(){
        f6.setVisible(false);
        f3.setVisible(true);
     }
     
     public void inserisciNuovaPswdAndUsername(String newPassword,  String newUsername){
         ConnectionToDataBase db1 = new ConnectionToDataBase();
         db1.nuovaPswdAndUsername(newPassword, newUsername);
     }
     
     public int cercaIdLoginProcuratoreController(String idProcuratore){
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        int idLoginDaEliminare = db1.prendiIdLoginPerEliminare(idProcuratore);
        return idLoginDaEliminare;
     }
     
     public void eliminaProcuratoreDaLogin(int idLogin){
         ConnectionToDataBase db1 = new ConnectionToDataBase();
         db1.eliminaProcuratoreDaLogin(idLogin);
     }
     
     public void apriFinestraModificaCredenziali(){
         f8 = new ModificaCredenziali(this);
         f3.setVisible(false);
         f8.setVisible(true);
     }
     
     public String[] prendiCredenzialiProcuratore(String idCopiato){
         ConnectionToDataBase db1 = new ConnectionToDataBase();
         String[] datiProcuratore = new String[2];
         datiProcuratore = db1.prendiCredenzialiProcuratore(idCopiato);
         return datiProcuratore;
     }
     
     public int prendiIdProcuratoreDaLoginController(String usernameProcuratore){
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        int n = db1.prendiIdProcuratoreDaLogin(usernameProcuratore);
        return n;
     }
    
     public void modificaPasswordProcuratore(String idProcuratore, String nuovaPassword){
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        db1.modificaPasswordProcuratore(idProcuratore, nuovaPassword);
     }
     
     public void tornaIndietroDaModificaPassword(){
        f8.setVisible(false);
        f3.setVisible(true);
     }
     
    
}

