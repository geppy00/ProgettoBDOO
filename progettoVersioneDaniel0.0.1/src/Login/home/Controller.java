
package Login.home;
import java.sql.*;


public class Controller {
    
    loginForm f1;
    Admin f2;
    
    public static void main(String[] args) {
        ConnectionToDataBase db1 = new ConnectionToDataBase();
       
        Controller theController = new Controller();
        loginForm f1 = new loginForm(theController); 
        f1.setVisible(true);
        
    }
    
public boolean accedi (String nomeUtente, String passwordUtente){
        int flag = 0;
        System.out.println("nomeUtente: "+nomeUtente+" passwordUtente: "+passwordUtente);
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        flag = db1.selectOperation(nomeUtente, passwordUtente);
        
        System.out.println(flag);
        
        if(flag == 1){
            System.out.println("Login effettuato con successo");
            //db1.stampaTabellaTerminale();
            return true;
        } else if(flag == 2){
            
            System.out.println("Benvenuto admin");
            f2.setVisible(true);
           
            return true;
                }
        
        else{
            System.out.println("Login non effettuato con successo");
            return false;
        }  
}
}

