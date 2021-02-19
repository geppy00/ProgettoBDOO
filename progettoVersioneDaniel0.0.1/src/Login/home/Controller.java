
package Login.home;
import java.sql.*;


public class Controller {
    
    loginForm f1;
    AdminPage f2;
    SezioneProcuratori f3;
    InserireNuovoProcuratore f4;
    EliminaProcuratore f5;
    AggiornaDatiProcuratore f6;
    CercaProcuratore f7;
    
    public static void main(String[] args) {
       
        Controller theController = new Controller();
        loginForm f1 = new loginForm(theController); 
        f1.setVisible(true);
        
    }
    
    public boolean accedi (String nomeUtente, String passwordUtente, loginForm f1){
        int flag = 0;
        System.out.println("nomeUtente: "+nomeUtente+" passwordUtente: "+passwordUtente);
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        flag = db1.selectOperation(nomeUtente, passwordUtente);
        
        System.out.println(flag);
        
        if(flag == 1){
            System.out.println("Login effettuato con successo");
            //db1.stampaTabellaTerminale();
            return true;
        } 
        else if(flag == 0){  
            System.out.println("Benvenuto admin");
            f2 = new AdminPage(this);
            f2.setVisible(true);
            f1.setVisible(false);
            return true;
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
     
     public void okButtonInserimento(int capCopiato, String cittaResidenzaCopiato, String codiceFiscCopiato, String cognomeCopiato, Date sqlDate, String ibanCopiato, String nomeCopiato, String viaCopiato, String codiceIDCopiato, String cittaNascitaCopiato){
          ConnectionToDataBase db1 = new ConnectionToDataBase();
          db1.InserisciNuovoProcuratore(capCopiato, cittaResidenzaCopiato, codiceFiscCopiato, cognomeCopiato, sqlDate, ibanCopiato, nomeCopiato, viaCopiato, codiceIDCopiato, cittaNascitaCopiato);
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
     
     public void aggiornaProcuratore(String idCopiato){
          ConnectionToDataBase db1 = new ConnectionToDataBase();
          db1.updateProcuratori(idCopiato);
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
}

