
package Login.home;
import java.sql.*;


public class Controller {
    
    loginForm f1;
    AdminPage f2;
    SezioneProcuratori f3;
    
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
}

